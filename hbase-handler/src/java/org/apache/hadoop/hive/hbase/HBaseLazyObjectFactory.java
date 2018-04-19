/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.hadoop.hive.hbase;

import org.apache.commons.lang3.StringUtils;
import org.apache.hadoop.hive.hbase.struct.HBaseValueFactory;
import org.apache.hadoop.hive.serde2.SerDeException;
import org.apache.hadoop.hive.serde2.lazy.LazySerDeParameters;
import org.apache.hadoop.hive.serde2.lazy.objectinspector.LazyObjectInspectorFactory;
import org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.ObjectInspectorFactory.ObjectInspectorOptions;
import org.apache.hadoop.hive.serde2.typeinfo.TypeInfo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Properties;

// Does same thing with LazyFactory#createLazyObjectInspector except that this replaces
// original keyOI with OI which is create by HBaseKeyFactory provided by serdes property for hbase
public class HBaseLazyObjectFactory {

  public static ObjectInspector createLazyHBaseStructInspector(
      LazySerDeParameters serdeParams, int index, HBaseKeyFactory keyFactory, List<HBaseValueFactory> valueFactories) throws SerDeException {
    List<TypeInfo> columnTypes = serdeParams.getColumnTypes();
    ArrayList<ObjectInspector> columnObjectInspectors = new ArrayList<ObjectInspector>(
        columnTypes.size());
    for (int i = 0; i < columnTypes.size(); i++) {
      if (i == index) {
        columnObjectInspectors.add(keyFactory.createKeyObjectInspector(columnTypes.get(i)));
      } else {
        columnObjectInspectors.add(valueFactories.get(i).createValueObjectInspector(
            columnTypes.get(i)));
      }
    }
    return LazyObjectInspectorFactory.getLazySimpleStructObjectInspector(
        serdeParams.getColumnNames(), columnObjectInspectors, null, serdeParams.getSeparators()[0],
        serdeParams, ObjectInspectorOptions.JAVA);
  }

  public static ObjectInspector createLazyHBaseStructInspector(HBaseSerDeParameters hSerdeParams,
      Properties tbl)
      throws SerDeException {
    List<TypeInfo> columnTypes = hSerdeParams.getColumnTypes();
    ArrayList<ObjectInspector> columnObjectInspectors = new ArrayList<ObjectInspector>(
        columnTypes.size());
    for (int i = 0; i < columnTypes.size(); i++) {
      if (i == hSerdeParams.getKeyIndex()) {
        columnObjectInspectors.add(hSerdeParams.getKeyFactory()
            .createKeyObjectInspector(columnTypes.get(i)));
      } else {
        columnObjectInspectors.add(hSerdeParams.getValueFactories().get(i)
            .createValueObjectInspector(columnTypes.get(i)));
      }
    }
    List<String> structFieldComments = StringUtils.isEmpty(tbl.getProperty("columns.comments")) ?
        new ArrayList<>(Collections.nCopies(columnTypes.size(), ""))
        : Arrays.asList(tbl.getProperty("columns.comments").split("\0", columnTypes.size()));

    return LazyObjectInspectorFactory.getLazySimpleStructObjectInspector(
        hSerdeParams.getColumnNames(), columnObjectInspectors, structFieldComments,
        hSerdeParams.getSerdeParams().getSeparators()[0],
        hSerdeParams.getSerdeParams(), ObjectInspectorOptions.JAVA);
  }
}