import 'package:drift/drift.dart';

/// جدول المحاضرين
class QuranWikiLecturers extends Table {
  IntColumn get id => integer().autoIncrement()();
  DateTimeColumn get deletedAt => dateTime().nullable()();
  DateTimeColumn get createdAt => dateTime().nullable()();
  DateTimeColumn get updatedAt => dateTime().nullable()();
  TextColumn get name => text().nullable()();
  TextColumn get fullName => text().nullable()();
  TextColumn get profile => text().withLength(max: 100).nullable()();
  TextColumn get code => text().nullable()();
  IntColumn get approvalStatus => integer().nullable()();
  BoolColumn get isComplete => boolean().withDefault(const Constant(false))();
}

/// جدول أنواع المحاضرين
class QuranWikiLecturerTypes extends Table {
  IntColumn get id => integer().autoIncrement()();
  DateTimeColumn get deletedAt => dateTime().nullable()();
  DateTimeColumn get createdAt => dateTime().nullable()();
  DateTimeColumn get updatedAt => dateTime().nullable()();
  TextColumn get displayName => text().nullable()();
  TextColumn get code => text().nullable()();
}

/// جدول ربط المحاضرين بالأنواع
class QuranWikiLecturerTypeRelations extends Table {
  IntColumn get id => integer().autoIncrement()();
  IntColumn get lecturerId => integer().nullable()();
  IntColumn get lecturerTypeId => integer().nullable()();
}

/// جدول المحاضرات
class QuranWikiLectures extends Table {
  IntColumn get id => integer().autoIncrement()();
  DateTimeColumn get deletedAt => dateTime().nullable()();
  DateTimeColumn get createdAt => dateTime().nullable()();
  DateTimeColumn get updatedAt => dateTime().nullable()();
  TextColumn get title => text().nullable()();
  TextColumn get keywords => text().nullable()();
  TextColumn get shortContent => text().nullable()();
  DateTimeColumn get date => dateTime().nullable()();
  IntColumn get ordr => integer().nullable()();
  TextColumn get cover => text().withLength(max: 100).nullable()();
  IntColumn get views => integer().nullable()();
  IntColumn get approvalStatus => integer().nullable()();
  BoolColumn get isComplete => boolean().withDefault(const Constant(false))();
  IntColumn get lecturerId => integer().nullable()();
  IntColumn get albumId => integer().nullable()();
}

/// جدول الفقرات
class QuranWikiParagraphs extends Table {
  IntColumn get id => integer().autoIncrement()();
  DateTimeColumn get deletedAt => dateTime().nullable()();
  DateTimeColumn get createdAt => dateTime().nullable()();
  DateTimeColumn get updatedAt => dateTime().nullable()();
  IntColumn get lectureId => integer().nullable()();
  TextColumn get title => text().nullable()();
  IntColumn get ordr => integer().nullable()();
  TextColumn get formattedContent => text().nullable()();
  TextColumn get content => text().nullable()();
  TextColumn get plainContent => text().nullable()();
  IntColumn get startPageNumber => integer().nullable()();
  IntColumn get approvalStatus => integer().nullable()();
}

/// جدول أنواع معلومات المحاضرات
class QuranWikiLectureInfoTypes extends Table {
  IntColumn get id => integer().autoIncrement()();
  DateTimeColumn get deletedAt => dateTime().nullable()();
  DateTimeColumn get createdAt => dateTime().nullable()();
  DateTimeColumn get updatedAt => dateTime().nullable()();
  TextColumn get name => text().nullable()();
  TextColumn get code => text().nullable()();
}

/// جدول معلومات المحاضرات
class QuranWikiLectureInfo extends Table {
  IntColumn get id => integer().autoIncrement()();
  DateTimeColumn get deletedAt => dateTime().nullable()();
  DateTimeColumn get createdAt => dateTime().nullable()();
  DateTimeColumn get updatedAt => dateTime().nullable()();
  TextColumn get value => text().nullable()();
  IntColumn get approvalStatus => integer().nullable()();
  IntColumn get lectureId => integer().nullable()();
  IntColumn get lectureInfoTypeId => integer().nullable()();
}

/// جدول واجهات المحاضرات
class QuranWikiLectureUI extends Table {
  IntColumn get id => integer().autoIncrement()();
  DateTimeColumn get deletedAt => dateTime().nullable()();
  DateTimeColumn get createdAt => dateTime().nullable()();
  DateTimeColumn get updatedAt => dateTime().nullable()();
  TextColumn get code => text().withLength(max: 50)();
  TextColumn get name => text().withLength(max: 50)();
  TextColumn get cover => text().withLength(max: 100).nullable()();
  TextColumn get description => text().nullable()();
  BoolColumn get isActive => boolean().withDefault(const Constant(false))();
}

/// جدول مجموعات المحاضرات
class QuranWikiLectureGroups extends Table {
  IntColumn get id => integer().autoIncrement()();
  DateTimeColumn get deletedAt => dateTime().nullable()();
  DateTimeColumn get createdAt => dateTime().nullable()();
  DateTimeColumn get updatedAt => dateTime().nullable()();
  TextColumn get name => text().nullable()();
  IntColumn get ordr => integer().nullable()();
  TextColumn get cover => text().withLength(max: 100).nullable()();
  IntColumn get lecturerId => integer().nullable()();
  IntColumn get lectureGroupId => integer().nullable()();
  IntColumn get lectureUiId => integer().nullable()();
}

/// جدول ربط المحاضرات بالمجموعات
class QuranWikiLectureGroupLectures extends Table {
  IntColumn get id => integer().autoIncrement()();
  DateTimeColumn get createdAt => dateTime().nullable()();
  DateTimeColumn get updatedAt => dateTime().nullable()();
  IntColumn get lectureGroupId => integer().nullable()();
  IntColumn get lectureId => integer().nullable()();
  IntColumn get ordr => integer().nullable()();
}

/// جدول أنواع الوسائط
class QuranWikiMediaTypes extends Table {
  IntColumn get id => integer().autoIncrement()();
  DateTimeColumn get deletedAt => dateTime().nullable()();
  DateTimeColumn get createdAt => dateTime().nullable()();
  DateTimeColumn get updatedAt => dateTime().nullable()();
  TextColumn get name => text().nullable()();
  TextColumn get extensions => text().nullable()();
  TextColumn get code => text().nullable()();
}

/// جدول الوسائط
class QuranWikiMedia extends Table {
  IntColumn get id => integer().autoIncrement()();
  DateTimeColumn get deletedAt => dateTime().nullable()();
  DateTimeColumn get createdAt => dateTime().nullable()();
  DateTimeColumn get updatedAt => dateTime().nullable()();
  TextColumn get name => text().nullable()();
  TextColumn get media => text().withLength(max: 100).nullable()();
  IntColumn get approvalStatus => integer().nullable()();
  IntColumn get albumId => integer().nullable()();
  IntColumn get lectureId => integer().nullable()();
  IntColumn get mediaTypeId => integer().nullable()();
}

/// جدول وسائط الفقرات
class QuranWikiParagraphMedia extends Table {
  IntColumn get id => integer().autoIncrement()();
  DateTimeColumn get deletedAt => dateTime().nullable()();
  DateTimeColumn get createdAt => dateTime().nullable()();
  DateTimeColumn get updatedAt => dateTime().nullable()();
  IntColumn get startAt => integer().nullable()();
  IntColumn get endAt => integer().nullable()();
  IntColumn get approvalStatus => integer().nullable()();
  IntColumn get mediaId => integer().nullable()();
  IntColumn get paragraphId => integer().nullable()();
}

/// جدول الألبومات
class QuranWikiAlbums extends Table {
  IntColumn get id => integer().autoIncrement()();
  DateTimeColumn get deletedAt => dateTime().nullable()();
  DateTimeColumn get createdAt => dateTime().nullable()();
  DateTimeColumn get updatedAt => dateTime().nullable()();
  TextColumn get name => text().nullable()();
  IntColumn get ordr => integer().nullable()();
  TextColumn get cover => text().withLength(max: 100).nullable()();
  BoolColumn get isActive => boolean().withDefault(const Constant(false))();
  IntColumn get lecturerId => integer().nullable()();
  IntColumn get lecturerTypeId => integer().nullable()();
  IntColumn get albumId => integer().nullable()();
}

/// جدول أنواع المعلومات الشخصية
class QuranWikiPersonalInfoTypes extends Table {
  IntColumn get id => integer().autoIncrement()();
  DateTimeColumn get deletedAt => dateTime().nullable()();
  DateTimeColumn get createdAt => dateTime().nullable()();
  DateTimeColumn get updatedAt => dateTime().nullable()();
  TextColumn get name => text().nullable()();
  BoolColumn get hasMedia => boolean().withDefault(const Constant(false))();
}

/// جدول المعلومات الشخصية
class QuranWikiPersonalInfo extends Table {
  IntColumn get id => integer().autoIncrement()();
  DateTimeColumn get deletedAt => dateTime().nullable()();
  DateTimeColumn get createdAt => dateTime().nullable()();
  DateTimeColumn get updatedAt => dateTime().nullable()();
  TextColumn get value => text().nullable()();
  IntColumn get approvalStatus => integer().nullable()();
  IntColumn get lecturerId => integer().nullable()();
  IntColumn get personalInfoTypeId => integer().nullable()();
}

/// جدول الوسائط الشخصية
class QuranWikiPersonalMedia extends Table {
  IntColumn get id => integer().autoIncrement()();
  DateTimeColumn get deletedAt => dateTime().nullable()();
  DateTimeColumn get createdAt => dateTime().nullable()();
  DateTimeColumn get updatedAt => dateTime().nullable()();
  TextColumn get name => text().nullable()();
  TextColumn get media => text().withLength(max: 100).nullable()();
  TextColumn get dat => text().withLength(max: 100).nullable()();
  IntColumn get approvalStatus => integer().nullable()();
  IntColumn get personalInfoId => integer().nullable()();
  IntColumn get mediaTypeId => integer().nullable()();
}

/// جدول الوسوم
class QuranWikiTags extends Table {
  IntColumn get id => integer().autoIncrement()();
  DateTimeColumn get deletedAt => dateTime().nullable()();
  DateTimeColumn get createdAt => dateTime().nullable()();
  DateTimeColumn get updatedAt => dateTime().nullable()();
  TextColumn get name => text().nullable()();
}

/// جدول ربط الوسوم بالمحاضرات
class QuranWikiTagLectures extends Table {
  IntColumn get id => integer().autoIncrement()();
  IntColumn get tagId => integer().nullable()();
  IntColumn get lectureId => integer().nullable()();
}

/// جدول الروابط النصية
class QuranWikiTextLinks extends Table {
  IntColumn get id => integer().autoIncrement()();
  DateTimeColumn get deletedAt => dateTime().nullable()();
  DateTimeColumn get createdAt => dateTime().nullable()();
  DateTimeColumn get updatedAt => dateTime().nullable()();
  TextColumn get linkText => text().nullable()();
  TextColumn get hint => text().nullable()();
  TextColumn get linkedTableName => text().nullable()();
  IntColumn get approvalStatus => integer().nullable()();
  IntColumn get paragraphId => integer().nullable()();
  IntColumn get tableRecordId => integer().nullable()();
}
