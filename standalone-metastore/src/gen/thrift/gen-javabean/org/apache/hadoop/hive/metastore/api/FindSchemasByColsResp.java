/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)")
@org.apache.hadoop.classification.InterfaceAudience.Public @org.apache.hadoop.classification.InterfaceStability.Stable public class FindSchemasByColsResp implements org.apache.thrift.TBase<FindSchemasByColsResp, FindSchemasByColsResp._Fields>, java.io.Serializable, Cloneable, Comparable<FindSchemasByColsResp> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("FindSchemasByColsResp");

  private static final org.apache.thrift.protocol.TField SCHEMA_VERSIONS_FIELD_DESC = new org.apache.thrift.protocol.TField("schemaVersions", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new FindSchemasByColsRespStandardSchemeFactory());
    schemes.put(TupleScheme.class, new FindSchemasByColsRespTupleSchemeFactory());
  }

  private List<FindSchemasByColsRespEntry> schemaVersions; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SCHEMA_VERSIONS((short)1, "schemaVersions");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // SCHEMA_VERSIONS
          return SCHEMA_VERSIONS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SCHEMA_VERSIONS, new org.apache.thrift.meta_data.FieldMetaData("schemaVersions", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, FindSchemasByColsRespEntry.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(FindSchemasByColsResp.class, metaDataMap);
  }

  public FindSchemasByColsResp() {
  }

  public FindSchemasByColsResp(
    List<FindSchemasByColsRespEntry> schemaVersions)
  {
    this();
    this.schemaVersions = schemaVersions;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public FindSchemasByColsResp(FindSchemasByColsResp other) {
    if (other.isSetSchemaVersions()) {
      List<FindSchemasByColsRespEntry> __this__schemaVersions = new ArrayList<FindSchemasByColsRespEntry>(other.schemaVersions.size());
      for (FindSchemasByColsRespEntry other_element : other.schemaVersions) {
        __this__schemaVersions.add(new FindSchemasByColsRespEntry(other_element));
      }
      this.schemaVersions = __this__schemaVersions;
    }
  }

  public FindSchemasByColsResp deepCopy() {
    return new FindSchemasByColsResp(this);
  }

  @Override
  public void clear() {
    this.schemaVersions = null;
  }

  public int getSchemaVersionsSize() {
    return (this.schemaVersions == null) ? 0 : this.schemaVersions.size();
  }

  public java.util.Iterator<FindSchemasByColsRespEntry> getSchemaVersionsIterator() {
    return (this.schemaVersions == null) ? null : this.schemaVersions.iterator();
  }

  public void addToSchemaVersions(FindSchemasByColsRespEntry elem) {
    if (this.schemaVersions == null) {
      this.schemaVersions = new ArrayList<FindSchemasByColsRespEntry>();
    }
    this.schemaVersions.add(elem);
  }

  public List<FindSchemasByColsRespEntry> getSchemaVersions() {
    return this.schemaVersions;
  }

  public void setSchemaVersions(List<FindSchemasByColsRespEntry> schemaVersions) {
    this.schemaVersions = schemaVersions;
  }

  public void unsetSchemaVersions() {
    this.schemaVersions = null;
  }

  /** Returns true if field schemaVersions is set (has been assigned a value) and false otherwise */
  public boolean isSetSchemaVersions() {
    return this.schemaVersions != null;
  }

  public void setSchemaVersionsIsSet(boolean value) {
    if (!value) {
      this.schemaVersions = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SCHEMA_VERSIONS:
      if (value == null) {
        unsetSchemaVersions();
      } else {
        setSchemaVersions((List<FindSchemasByColsRespEntry>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SCHEMA_VERSIONS:
      return getSchemaVersions();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SCHEMA_VERSIONS:
      return isSetSchemaVersions();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof FindSchemasByColsResp)
      return this.equals((FindSchemasByColsResp)that);
    return false;
  }

  public boolean equals(FindSchemasByColsResp that) {
    if (that == null)
      return false;

    boolean this_present_schemaVersions = true && this.isSetSchemaVersions();
    boolean that_present_schemaVersions = true && that.isSetSchemaVersions();
    if (this_present_schemaVersions || that_present_schemaVersions) {
      if (!(this_present_schemaVersions && that_present_schemaVersions))
        return false;
      if (!this.schemaVersions.equals(that.schemaVersions))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_schemaVersions = true && (isSetSchemaVersions());
    list.add(present_schemaVersions);
    if (present_schemaVersions)
      list.add(schemaVersions);

    return list.hashCode();
  }

  @Override
  public int compareTo(FindSchemasByColsResp other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetSchemaVersions()).compareTo(other.isSetSchemaVersions());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSchemaVersions()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.schemaVersions, other.schemaVersions);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("FindSchemasByColsResp(");
    boolean first = true;

    sb.append("schemaVersions:");
    if (this.schemaVersions == null) {
      sb.append("null");
    } else {
      sb.append(this.schemaVersions);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class FindSchemasByColsRespStandardSchemeFactory implements SchemeFactory {
    public FindSchemasByColsRespStandardScheme getScheme() {
      return new FindSchemasByColsRespStandardScheme();
    }
  }

  private static class FindSchemasByColsRespStandardScheme extends StandardScheme<FindSchemasByColsResp> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, FindSchemasByColsResp struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SCHEMA_VERSIONS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list826 = iprot.readListBegin();
                struct.schemaVersions = new ArrayList<FindSchemasByColsRespEntry>(_list826.size);
                FindSchemasByColsRespEntry _elem827;
                for (int _i828 = 0; _i828 < _list826.size; ++_i828)
                {
                  _elem827 = new FindSchemasByColsRespEntry();
                  _elem827.read(iprot);
                  struct.schemaVersions.add(_elem827);
                }
                iprot.readListEnd();
              }
              struct.setSchemaVersionsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, FindSchemasByColsResp struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.schemaVersions != null) {
        oprot.writeFieldBegin(SCHEMA_VERSIONS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.schemaVersions.size()));
          for (FindSchemasByColsRespEntry _iter829 : struct.schemaVersions)
          {
            _iter829.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class FindSchemasByColsRespTupleSchemeFactory implements SchemeFactory {
    public FindSchemasByColsRespTupleScheme getScheme() {
      return new FindSchemasByColsRespTupleScheme();
    }
  }

  private static class FindSchemasByColsRespTupleScheme extends TupleScheme<FindSchemasByColsResp> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, FindSchemasByColsResp struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetSchemaVersions()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetSchemaVersions()) {
        {
          oprot.writeI32(struct.schemaVersions.size());
          for (FindSchemasByColsRespEntry _iter830 : struct.schemaVersions)
          {
            _iter830.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, FindSchemasByColsResp struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list831 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.schemaVersions = new ArrayList<FindSchemasByColsRespEntry>(_list831.size);
          FindSchemasByColsRespEntry _elem832;
          for (int _i833 = 0; _i833 < _list831.size; ++_i833)
          {
            _elem832 = new FindSchemasByColsRespEntry();
            _elem832.read(iprot);
            struct.schemaVersions.add(_elem832);
          }
        }
        struct.setSchemaVersionsIsSet(true);
      }
    }
  }

}

