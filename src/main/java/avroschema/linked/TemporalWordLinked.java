/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package avroschema.linked;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class TemporalWordLinked extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"TemporalWordLinked\",\"namespace\":\"avroschema.linked\",\"fields\":[{\"name\":\"modified_word\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"time_linked\",\"type\":{\"type\":\"record\",\"name\":\"TimeLinked\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"timex3_type\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"timex3_xml\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"disambiguated\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"core_words\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"TokenLinked\",\"fields\":[{\"name\":\"pos\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"]},{\"name\":\"ner\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"]},{\"name\":\"span\",\"type\":{\"type\":\"record\",\"name\":\"Span\",\"fields\":[{\"name\":\"start_index\",\"type\":[\"int\",\"null\"]},{\"name\":\"end_index\",\"type\":[\"int\",\"null\"]}]}},{\"name\":\"lemma\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"]},{\"name\":\"word\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"]},{\"name\":\"index\",\"type\":[\"int\",\"null\"]},{\"name\":\"w_link\",\"type\":{\"type\":\"record\",\"name\":\"WikiLink\",\"fields\":[{\"name\":\"offset_begin_ind\",\"type\":\"int\"},{\"name\":\"offset_end_ind\",\"type\":\"int\"},{\"name\":\"phrase\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"wiki_link\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}}]}}]},{\"name\":\"pre_mods\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"TokenLinked\"}]},{\"name\":\"post_mods\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"TokenLinked\"}]},{\"name\":\"all_words\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"TokenLinked\"}]},{\"name\":\"predicate\",\"type\":[\"null\",\"TokenLinked\"]}]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String modified_word;
  @Deprecated public avroschema.linked.TimeLinked time_linked;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public TemporalWordLinked() {}

  /**
   * All-args constructor.
   */
  public TemporalWordLinked(java.lang.String modified_word, avroschema.linked.TimeLinked time_linked) {
    this.modified_word = modified_word;
    this.time_linked = time_linked;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return modified_word;
    case 1: return time_linked;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: modified_word = (java.lang.String)value$; break;
    case 1: time_linked = (avroschema.linked.TimeLinked)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'modified_word' field.
   */
  public java.lang.String getModifiedWord() {
    return modified_word;
  }

  /**
   * Sets the value of the 'modified_word' field.
   * @param value the value to set.
   */
  public void setModifiedWord(java.lang.String value) {
    this.modified_word = value;
  }

  /**
   * Gets the value of the 'time_linked' field.
   */
  public avroschema.linked.TimeLinked getTimeLinked() {
    return time_linked;
  }

  /**
   * Sets the value of the 'time_linked' field.
   * @param value the value to set.
   */
  public void setTimeLinked(avroschema.linked.TimeLinked value) {
    this.time_linked = value;
  }

  /** Creates a new TemporalWordLinked RecordBuilder */
  public static avroschema.linked.TemporalWordLinked.Builder newBuilder() {
    return new avroschema.linked.TemporalWordLinked.Builder();
  }
  
  /** Creates a new TemporalWordLinked RecordBuilder by copying an existing Builder */
  public static avroschema.linked.TemporalWordLinked.Builder newBuilder(avroschema.linked.TemporalWordLinked.Builder other) {
    return new avroschema.linked.TemporalWordLinked.Builder(other);
  }
  
  /** Creates a new TemporalWordLinked RecordBuilder by copying an existing TemporalWordLinked instance */
  public static avroschema.linked.TemporalWordLinked.Builder newBuilder(avroschema.linked.TemporalWordLinked other) {
    return new avroschema.linked.TemporalWordLinked.Builder(other);
  }
  
  /**
   * RecordBuilder for TemporalWordLinked instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<TemporalWordLinked>
    implements org.apache.avro.data.RecordBuilder<TemporalWordLinked> {

    private java.lang.String modified_word;
    private avroschema.linked.TimeLinked time_linked;

    /** Creates a new Builder */
    private Builder() {
      super(avroschema.linked.TemporalWordLinked.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(avroschema.linked.TemporalWordLinked.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.modified_word)) {
        this.modified_word = data().deepCopy(fields()[0].schema(), other.modified_word);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.time_linked)) {
        this.time_linked = data().deepCopy(fields()[1].schema(), other.time_linked);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing TemporalWordLinked instance */
    private Builder(avroschema.linked.TemporalWordLinked other) {
            super(avroschema.linked.TemporalWordLinked.SCHEMA$);
      if (isValidValue(fields()[0], other.modified_word)) {
        this.modified_word = data().deepCopy(fields()[0].schema(), other.modified_word);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.time_linked)) {
        this.time_linked = data().deepCopy(fields()[1].schema(), other.time_linked);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'modified_word' field */
    public java.lang.String getModifiedWord() {
      return modified_word;
    }
    
    /** Sets the value of the 'modified_word' field */
    public avroschema.linked.TemporalWordLinked.Builder setModifiedWord(java.lang.String value) {
      validate(fields()[0], value);
      this.modified_word = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'modified_word' field has been set */
    public boolean hasModifiedWord() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'modified_word' field */
    public avroschema.linked.TemporalWordLinked.Builder clearModifiedWord() {
      modified_word = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'time_linked' field */
    public avroschema.linked.TimeLinked getTimeLinked() {
      return time_linked;
    }
    
    /** Sets the value of the 'time_linked' field */
    public avroschema.linked.TemporalWordLinked.Builder setTimeLinked(avroschema.linked.TimeLinked value) {
      validate(fields()[1], value);
      this.time_linked = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'time_linked' field has been set */
    public boolean hasTimeLinked() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'time_linked' field */
    public avroschema.linked.TemporalWordLinked.Builder clearTimeLinked() {
      time_linked = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public TemporalWordLinked build() {
      try {
        TemporalWordLinked record = new TemporalWordLinked();
        record.modified_word = fieldSetFlags()[0] ? this.modified_word : (java.lang.String) defaultValue(fields()[0]);
        record.time_linked = fieldSetFlags()[1] ? this.time_linked : (avroschema.linked.TimeLinked) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}