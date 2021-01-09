// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package scalapb.options

/** @param extends
  *   Additional classes and traits to mix in to the case class.
  * @param companionExtends
  *   Additional classes and traits to mix in to the companion object.
  * @param annotations
  *   Custom annotations to add to the generated case class.
  * @param type
  *   All instances of this message will be converted to this type. An implicit TypeMapper
  *   must be present.
  * @param companionAnnotations
  *   Custom annotations to add to the companion object of the generated class.
  * @param sealedOneofExtends
  *   Additional classes and traits to mix in to generated sealed_oneof base trait.
  * @param noBox
  *   If true, when this message is used as an optional field, do not wrap it in an `Option`.
  *   This is equivalent of setting `(field).no_box` to true on each field with the message type.
  * @param unknownFieldsAnnotations
  *   Custom annotations to add to the generated `unknownFields` case class field.
  */
@SerialVersionUID(0L)
final case class MessageOptions(
    `extends`: _root_.scala.Seq[_root_.scala.Predef.String] = _root_.scala.Seq.empty,
    companionExtends: _root_.scala.Seq[_root_.scala.Predef.String] = _root_.scala.Seq.empty,
    annotations: _root_.scala.Seq[_root_.scala.Predef.String] = _root_.scala.Seq.empty,
    `type`: _root_.scala.Option[_root_.scala.Predef.String] = _root_.scala.None,
    companionAnnotations: _root_.scala.Seq[_root_.scala.Predef.String] = _root_.scala.Seq.empty,
    sealedOneofExtends: _root_.scala.Seq[_root_.scala.Predef.String] = _root_.scala.Seq.empty,
    noBox: _root_.scala.Option[_root_.scala.Boolean] = _root_.scala.None,
    unknownFieldsAnnotations: _root_.scala.Seq[_root_.scala.Predef.String] = _root_.scala.Seq.empty,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[MessageOptions] with _root_.scalapb.ExtendableMessage[MessageOptions] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      `extends`.foreach { __item =>
        val __value = __item
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
      }
      companionExtends.foreach { __item =>
        val __value = __item
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, __value)
      }
      annotations.foreach { __item =>
        val __value = __item
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(3, __value)
      }
      if (`type`.isDefined) {
        val __value = `type`.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(4, __value)
      };
      companionAnnotations.foreach { __item =>
        val __value = __item
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(5, __value)
      }
      sealedOneofExtends.foreach { __item =>
        val __value = __item
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(6, __value)
      }
      if (noBox.isDefined) {
        val __value = noBox.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeBoolSize(7, __value)
      };
      unknownFieldsAnnotations.foreach { __item =>
        val __value = __item
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(8, __value)
      }
      __size += unknownFields.serializedSize
      __size
    }
    override def serializedSize: _root_.scala.Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      `extends`.foreach { __v =>
        val __m = __v
        _output__.writeString(1, __m)
      };
      companionExtends.foreach { __v =>
        val __m = __v
        _output__.writeString(2, __m)
      };
      annotations.foreach { __v =>
        val __m = __v
        _output__.writeString(3, __m)
      };
      `type`.foreach { __v =>
        val __m = __v
        _output__.writeString(4, __m)
      };
      companionAnnotations.foreach { __v =>
        val __m = __v
        _output__.writeString(5, __m)
      };
      sealedOneofExtends.foreach { __v =>
        val __m = __v
        _output__.writeString(6, __m)
      };
      noBox.foreach { __v =>
        val __m = __v
        _output__.writeBool(7, __m)
      };
      unknownFieldsAnnotations.foreach { __v =>
        val __m = __v
        _output__.writeString(8, __m)
      };
      unknownFields.writeTo(_output__)
    }
    def clearExtends = copy(`extends` = _root_.scala.Seq.empty)
    def addExtends(__vs: _root_.scala.Predef.String*): MessageOptions = addAllExtends(__vs)
    def addAllExtends(__vs: Iterable[_root_.scala.Predef.String]): MessageOptions = copy(`extends` = `extends` ++ __vs)
    def withExtends(__v: _root_.scala.Seq[_root_.scala.Predef.String]): MessageOptions = copy(`extends` = __v)
    def clearCompanionExtends = copy(companionExtends = _root_.scala.Seq.empty)
    def addCompanionExtends(__vs: _root_.scala.Predef.String*): MessageOptions = addAllCompanionExtends(__vs)
    def addAllCompanionExtends(__vs: Iterable[_root_.scala.Predef.String]): MessageOptions = copy(companionExtends = companionExtends ++ __vs)
    def withCompanionExtends(__v: _root_.scala.Seq[_root_.scala.Predef.String]): MessageOptions = copy(companionExtends = __v)
    def clearAnnotations = copy(annotations = _root_.scala.Seq.empty)
    def addAnnotations(__vs: _root_.scala.Predef.String*): MessageOptions = addAllAnnotations(__vs)
    def addAllAnnotations(__vs: Iterable[_root_.scala.Predef.String]): MessageOptions = copy(annotations = annotations ++ __vs)
    def withAnnotations(__v: _root_.scala.Seq[_root_.scala.Predef.String]): MessageOptions = copy(annotations = __v)
    def getType: _root_.scala.Predef.String = `type`.getOrElse("")
    def clearType: MessageOptions = copy(`type` = _root_.scala.None)
    def withType(__v: _root_.scala.Predef.String): MessageOptions = copy(`type` = Option(__v))
    def clearCompanionAnnotations = copy(companionAnnotations = _root_.scala.Seq.empty)
    def addCompanionAnnotations(__vs: _root_.scala.Predef.String*): MessageOptions = addAllCompanionAnnotations(__vs)
    def addAllCompanionAnnotations(__vs: Iterable[_root_.scala.Predef.String]): MessageOptions = copy(companionAnnotations = companionAnnotations ++ __vs)
    def withCompanionAnnotations(__v: _root_.scala.Seq[_root_.scala.Predef.String]): MessageOptions = copy(companionAnnotations = __v)
    def clearSealedOneofExtends = copy(sealedOneofExtends = _root_.scala.Seq.empty)
    def addSealedOneofExtends(__vs: _root_.scala.Predef.String*): MessageOptions = addAllSealedOneofExtends(__vs)
    def addAllSealedOneofExtends(__vs: Iterable[_root_.scala.Predef.String]): MessageOptions = copy(sealedOneofExtends = sealedOneofExtends ++ __vs)
    def withSealedOneofExtends(__v: _root_.scala.Seq[_root_.scala.Predef.String]): MessageOptions = copy(sealedOneofExtends = __v)
    def getNoBox: _root_.scala.Boolean = noBox.getOrElse(false)
    def clearNoBox: MessageOptions = copy(noBox = _root_.scala.None)
    def withNoBox(__v: _root_.scala.Boolean): MessageOptions = copy(noBox = Option(__v))
    def clearUnknownFieldsAnnotations = copy(unknownFieldsAnnotations = _root_.scala.Seq.empty)
    def addUnknownFieldsAnnotations(__vs: _root_.scala.Predef.String*): MessageOptions = addAllUnknownFieldsAnnotations(__vs)
    def addAllUnknownFieldsAnnotations(__vs: Iterable[_root_.scala.Predef.String]): MessageOptions = copy(unknownFieldsAnnotations = unknownFieldsAnnotations ++ __vs)
    def withUnknownFieldsAnnotations(__v: _root_.scala.Seq[_root_.scala.Predef.String]): MessageOptions = copy(unknownFieldsAnnotations = __v)
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => `extends`
        case 2 => companionExtends
        case 3 => annotations
        case 4 => `type`.orNull
        case 5 => companionAnnotations
        case 6 => sealedOneofExtends
        case 7 => noBox.orNull
        case 8 => unknownFieldsAnnotations
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PRepeated(`extends`.iterator.map(_root_.scalapb.descriptors.PString(_)).toVector)
        case 2 => _root_.scalapb.descriptors.PRepeated(companionExtends.iterator.map(_root_.scalapb.descriptors.PString(_)).toVector)
        case 3 => _root_.scalapb.descriptors.PRepeated(annotations.iterator.map(_root_.scalapb.descriptors.PString(_)).toVector)
        case 4 => `type`.map(_root_.scalapb.descriptors.PString(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 5 => _root_.scalapb.descriptors.PRepeated(companionAnnotations.iterator.map(_root_.scalapb.descriptors.PString(_)).toVector)
        case 6 => _root_.scalapb.descriptors.PRepeated(sealedOneofExtends.iterator.map(_root_.scalapb.descriptors.PString(_)).toVector)
        case 7 => noBox.map(_root_.scalapb.descriptors.PBoolean(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 8 => _root_.scalapb.descriptors.PRepeated(unknownFieldsAnnotations.iterator.map(_root_.scalapb.descriptors.PString(_)).toVector)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = scalapb.options.MessageOptions
    // @@protoc_insertion_point(GeneratedMessage[scalapb.MessageOptions])
}

object MessageOptions extends scalapb.GeneratedMessageCompanion[scalapb.options.MessageOptions] with scalapb.HasBuilder[scalapb.options.MessageOptions] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[scalapb.options.MessageOptions] with scalapb.HasBuilder[scalapb.options.MessageOptions] = this
  def merge(`_message__`: scalapb.options.MessageOptions, `_input__`: _root_.com.google.protobuf.CodedInputStream): scalapb.options.MessageOptions = newBuilder(_message__).merge(_input__).result()
  implicit def messageReads: _root_.scalapb.descriptors.Reads[scalapb.options.MessageOptions] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      scalapb.options.MessageOptions(
        `extends` = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Seq[_root_.scala.Predef.String]]).getOrElse(_root_.scala.Seq.empty),
        companionExtends = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Seq[_root_.scala.Predef.String]]).getOrElse(_root_.scala.Seq.empty),
        annotations = __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scala.Seq[_root_.scala.Predef.String]]).getOrElse(_root_.scala.Seq.empty),
        `type` = __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Predef.String]]),
        companionAnnotations = __fieldsMap.get(scalaDescriptor.findFieldByNumber(5).get).map(_.as[_root_.scala.Seq[_root_.scala.Predef.String]]).getOrElse(_root_.scala.Seq.empty),
        sealedOneofExtends = __fieldsMap.get(scalaDescriptor.findFieldByNumber(6).get).map(_.as[_root_.scala.Seq[_root_.scala.Predef.String]]).getOrElse(_root_.scala.Seq.empty),
        noBox = __fieldsMap.get(scalaDescriptor.findFieldByNumber(7).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Boolean]]),
        unknownFieldsAnnotations = __fieldsMap.get(scalaDescriptor.findFieldByNumber(8).get).map(_.as[_root_.scala.Seq[_root_.scala.Predef.String]]).getOrElse(_root_.scala.Seq.empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = ScalapbProto.javaDescriptor.getMessageTypes().get(1)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = ScalapbProto.scalaDescriptor.messages(1)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = scalapb.options.MessageOptions(
    `extends` = _root_.scala.Seq.empty,
    companionExtends = _root_.scala.Seq.empty,
    annotations = _root_.scala.Seq.empty,
    `type` = _root_.scala.None,
    companionAnnotations = _root_.scala.Seq.empty,
    sealedOneofExtends = _root_.scala.Seq.empty,
    noBox = _root_.scala.None,
    unknownFieldsAnnotations = _root_.scala.Seq.empty
  )
  final class Builder private (
    private var __extends: _root_.scala.collection.mutable.Builder[_root_.scala.Predef.String, _root_.scala.Seq[_root_.scala.Predef.String]],
    private var __companionExtends: _root_.scala.collection.mutable.Builder[_root_.scala.Predef.String, _root_.scala.Seq[_root_.scala.Predef.String]],
    private var __annotations: _root_.scala.collection.mutable.Builder[_root_.scala.Predef.String, _root_.scala.Seq[_root_.scala.Predef.String]],
    private var __type: _root_.scala.Option[_root_.scala.Predef.String],
    private var __companionAnnotations: _root_.scala.collection.mutable.Builder[_root_.scala.Predef.String, _root_.scala.Seq[_root_.scala.Predef.String]],
    private var __sealedOneofExtends: _root_.scala.collection.mutable.Builder[_root_.scala.Predef.String, _root_.scala.Seq[_root_.scala.Predef.String]],
    private var __noBox: _root_.scala.Option[_root_.scala.Boolean],
    private var __unknownFieldsAnnotations: _root_.scala.collection.mutable.Builder[_root_.scala.Predef.String, _root_.scala.Seq[_root_.scala.Predef.String]],
    private var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder
  ) extends _root_.scalapb.MessageBuilder[scalapb.options.MessageOptions] {
    def merge(`_input__`: _root_.com.google.protobuf.CodedInputStream): this.type = {
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __extends += _input__.readStringRequireUtf8()
          case 18 =>
            __companionExtends += _input__.readStringRequireUtf8()
          case 26 =>
            __annotations += _input__.readStringRequireUtf8()
          case 34 =>
            __type = Option(_input__.readStringRequireUtf8())
          case 42 =>
            __companionAnnotations += _input__.readStringRequireUtf8()
          case 50 =>
            __sealedOneofExtends += _input__.readStringRequireUtf8()
          case 56 =>
            __noBox = Option(_input__.readBool())
          case 66 =>
            __unknownFieldsAnnotations += _input__.readStringRequireUtf8()
          case tag =>
            if (_unknownFields__ == null) {
              _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
            }
            _unknownFields__.parseField(tag, _input__)
        }
      }
      this
    }
    def result(): scalapb.options.MessageOptions = {
      scalapb.options.MessageOptions(
        `extends` = __extends.result(),
        companionExtends = __companionExtends.result(),
        annotations = __annotations.result(),
        `type` = __type,
        companionAnnotations = __companionAnnotations.result(),
        sealedOneofExtends = __sealedOneofExtends.result(),
        noBox = __noBox,
        unknownFieldsAnnotations = __unknownFieldsAnnotations.result(),
        unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
      )
    }
  }
  object Builder extends _root_.scalapb.MessageBuilderCompanion[scalapb.options.MessageOptions, scalapb.options.MessageOptions.Builder] {
    def apply(): Builder = new Builder(
      __extends = _root_.scala.collection.immutable.Vector.newBuilder[_root_.scala.Predef.String],
      __companionExtends = _root_.scala.collection.immutable.Vector.newBuilder[_root_.scala.Predef.String],
      __annotations = _root_.scala.collection.immutable.Vector.newBuilder[_root_.scala.Predef.String],
      __type = _root_.scala.None,
      __companionAnnotations = _root_.scala.collection.immutable.Vector.newBuilder[_root_.scala.Predef.String],
      __sealedOneofExtends = _root_.scala.collection.immutable.Vector.newBuilder[_root_.scala.Predef.String],
      __noBox = _root_.scala.None,
      __unknownFieldsAnnotations = _root_.scala.collection.immutable.Vector.newBuilder[_root_.scala.Predef.String],
      `_unknownFields__` = null
    )
    def apply(`_message__`: scalapb.options.MessageOptions): Builder = new Builder(
        __extends = _root_.scala.collection.immutable.Vector.newBuilder[_root_.scala.Predef.String] ++= _message__.`extends`,
        __companionExtends = _root_.scala.collection.immutable.Vector.newBuilder[_root_.scala.Predef.String] ++= _message__.companionExtends,
        __annotations = _root_.scala.collection.immutable.Vector.newBuilder[_root_.scala.Predef.String] ++= _message__.annotations,
        __type = _message__.`type`,
        __companionAnnotations = _root_.scala.collection.immutable.Vector.newBuilder[_root_.scala.Predef.String] ++= _message__.companionAnnotations,
        __sealedOneofExtends = _root_.scala.collection.immutable.Vector.newBuilder[_root_.scala.Predef.String] ++= _message__.sealedOneofExtends,
        __noBox = _message__.noBox,
        __unknownFieldsAnnotations = _root_.scala.collection.immutable.Vector.newBuilder[_root_.scala.Predef.String] ++= _message__.unknownFieldsAnnotations,
        `_unknownFields__` = new _root_.scalapb.UnknownFieldSet.Builder(_message__.unknownFields)
    )
  }
  def newBuilder: Builder = scalapb.options.MessageOptions.Builder()
  def newBuilder(`_message__`: scalapb.options.MessageOptions): Builder = scalapb.options.MessageOptions.Builder(_message__)
  implicit class MessageOptionsLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, scalapb.options.MessageOptions]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, scalapb.options.MessageOptions](_l) {
    def `extends`: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[_root_.scala.Predef.String]] = field(_.`extends`)((c_, f_) => c_.copy(`extends` = f_))
    def companionExtends: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[_root_.scala.Predef.String]] = field(_.companionExtends)((c_, f_) => c_.copy(companionExtends = f_))
    def annotations: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[_root_.scala.Predef.String]] = field(_.annotations)((c_, f_) => c_.copy(annotations = f_))
    def `type`: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.getType)((c_, f_) => c_.copy(`type` = Option(f_)))
    def optionalType: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Predef.String]] = field(_.`type`)((c_, f_) => c_.copy(`type` = f_))
    def companionAnnotations: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[_root_.scala.Predef.String]] = field(_.companionAnnotations)((c_, f_) => c_.copy(companionAnnotations = f_))
    def sealedOneofExtends: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[_root_.scala.Predef.String]] = field(_.sealedOneofExtends)((c_, f_) => c_.copy(sealedOneofExtends = f_))
    def noBox: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Boolean] = field(_.getNoBox)((c_, f_) => c_.copy(noBox = Option(f_)))
    def optionalNoBox: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Boolean]] = field(_.noBox)((c_, f_) => c_.copy(noBox = f_))
    def unknownFieldsAnnotations: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[_root_.scala.Predef.String]] = field(_.unknownFieldsAnnotations)((c_, f_) => c_.copy(unknownFieldsAnnotations = f_))
  }
  final val EXTENDS_FIELD_NUMBER = 1
  final val COMPANION_EXTENDS_FIELD_NUMBER = 2
  final val ANNOTATIONS_FIELD_NUMBER = 3
  final val TYPE_FIELD_NUMBER = 4
  final val COMPANION_ANNOTATIONS_FIELD_NUMBER = 5
  final val SEALED_ONEOF_EXTENDS_FIELD_NUMBER = 6
  final val NO_BOX_FIELD_NUMBER = 7
  final val UNKNOWN_FIELDS_ANNOTATIONS_FIELD_NUMBER = 8
  def of(
    `extends`: _root_.scala.Seq[_root_.scala.Predef.String],
    companionExtends: _root_.scala.Seq[_root_.scala.Predef.String],
    annotations: _root_.scala.Seq[_root_.scala.Predef.String],
    `type`: _root_.scala.Option[_root_.scala.Predef.String],
    companionAnnotations: _root_.scala.Seq[_root_.scala.Predef.String],
    sealedOneofExtends: _root_.scala.Seq[_root_.scala.Predef.String],
    noBox: _root_.scala.Option[_root_.scala.Boolean],
    unknownFieldsAnnotations: _root_.scala.Seq[_root_.scala.Predef.String]
  ): _root_.scalapb.options.MessageOptions = _root_.scalapb.options.MessageOptions(
    `extends`,
    companionExtends,
    annotations,
    `type`,
    companionAnnotations,
    sealedOneofExtends,
    noBox,
    unknownFieldsAnnotations
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[scalapb.MessageOptions])
}
