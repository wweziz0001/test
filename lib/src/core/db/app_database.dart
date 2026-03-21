import 'dart:io';
import 'package:drift/drift.dart';
import 'package:drift/native.dart';
import 'package:path/path.dart' as p;
import 'package:path_provider/path_provider.dart';
import 'tables/quran_tables.dart';
import 'tables/wiki_tables.dart';
import 'tables/user_tables.dart';

part 'app_database.g.dart';

@DriftDatabase(
  tables: [
    // Quran Tables
    QuranSurahs,
    QuranAyahs,
    QuranPages,
    QuranJuzs,
    QuranHizbs,
    QuranGlyphs,
    QuranGlyphTypes,
    QuranReciters,
    QuranRecitations,
    QuranReciterTypes,
    QuranReciterAudios,
    QuranAyahAudios,
    CommonCountries,
    // Wiki Tables
    QuranWikiLecturers,
    QuranWikiLecturerTypes,
    QuranWikiLecturerTypeRelations,
    QuranWikiLectures,
    QuranWikiParagraphs,
    QuranWikiLectureInfoTypes,
    QuranWikiLectureInfo,
    QuranWikiLectureUI,
    QuranWikiLectureGroups,
    QuranWikiLectureGroupLectures,
    QuranWikiMediaTypes,
    QuranWikiMedia,
    QuranWikiParagraphMedia,
    QuranWikiAlbums,
    QuranWikiPersonalInfoTypes,
    QuranWikiPersonalInfo,
    QuranWikiPersonalMedia,
    QuranWikiTags,
    QuranWikiTagLectures,
    QuranWikiTextLinks,
    // User Tables
    Khitmahs,
    KhitmahDailyQuotas,
    FavoriteAyahs,
    FavoriteLectures,
    AyahGroups,
    AyahGroupAyahs,
    StopPoints,
    LectureStopPoints,
    ReadingPrograms,
    ReadingProgramDays,
    ReadingProgramTasks,
    ReadingProgramTaskTypes,
    ReadingProgramTaskUnits,
    DailyAyah,
    Bookmarks,
    ReadingHistory,
    Downloads,
  ],
)
class AppDatabase extends _$AppDatabase {
  AppDatabase() : super(_openConnection());

  @override
  int get schemaVersion => 2;

  @override
  MigrationStrategy get migration {
    return MigrationStrategy(
      onCreate: (Migrator m) async {
        await m.createAll();
      },
      onUpgrade: (Migrator m, int from, int to) async {
        // Handle migrations between versions
        if (from < 2) {
          // Add migration logic here for version 2
        }
      },
    );
  }

  // استعلامات السور
  Future<List<QuranSurah>> getAllSurahs() => select(quranSurahs).get();

  Future<QuranSurah?> getSurahById(int id) =>
      (select(quranSurahs)..where((t) => t.id.equals(id))).getSingleOrNull();

  Future<QuranSurah?> getSurahByMoshafOrder(int order) =>
      (select(quranSurahs)..where((t) => t.moshafOrder.equals(order)))
          .getSingleOrNull();

  // استعلامات الآيات
  Future<List<QuranAyah>> getAyahsBySurahId(int surahId) =>
      (select(quranAyahs)..where((t) => t.surahId.equals(surahId)))
          .get();

  Future<QuranAyah?> getAyahById(int id) =>
      (select(quranAyahs)..where((t) => t.id.equals(id))).getSingleOrNull();

  Future<List<QuranAyah>> getAyahsByPageId(int pageId) =>
      (select(quranAyahs)..where((t) => t.pageId.equals(pageId)))
          .get();

  Future<List<QuranAyah>> searchAyahs(String query) =>
      (select(quranAyahs)..where((t) => t.plainText.like('%$query%')))
          .get();

  // استعلامات الصفحات
  Future<List<QuranPage>> getAllPages() => select(quranPages).get();

  Future<QuranPage?> getPageByNumber(int pageNumber) =>
      (select(quranPages)..where((t) => t.pageNumber.equals(pageNumber)))
          .getSingleOrNull();

  // استعلامات الأجزاء
  Future<List<QuranJuz>> getAllJuzs() => select(quranJuzs).get();

  Future<QuranJuz?> getJuzByNumber(int juzNumber) =>
      (select(quranJuzs)..where((t) => t.juzNumber.equals(juzNumber)))
          .getSingleOrNull();

  // استعلامات الأحزاب
  Future<List<QuranHizb>> getAllHizbs() => select(quranHizbs).get();

  // استعلامات القراء
  Future<List<QuranReciter>> getAllReciters() =>
      (select(quranReciters)..where((t) => t.deletedAt.isNull())).get();

  Future<QuranReciter?> getReciterById(int id) =>
      (select(quranReciters)..where((t) => t.id.equals(id)))
          .getSingleOrNull();

  // استعلامات التلاوات
  Future<List<QuranRecitation>> getAllRecitations() =>
      (select(quranRecitations)..where((t) => t.deletedAt.isNull())).get();

  // استعلامات صوتيات القراء
  Future<List<QuranReciterAudio>> getReciterAudios(int reciterId) =>
      (select(quranReciterAudios)
            ..where((t) => t.reciterId.equals(reciterId) & t.deletedAt.isNull()))
          .get();

  Future<QuranReciterAudio?> getReciterAudioForSurah(int reciterId, int surahId) =>
      (select(quranReciterAudios)
            ..where((t) =>
                t.reciterId.equals(reciterId) &
                t.surahId.equals(surahId) &
                t.deletedAt.isNull()))
          .getSingleOrNull();

  // استعلامات صوتيات الآيات
  Future<List<QuranAyahAudio>> getAyahAudios(int reciterAudioId) =>
      (select(quranAyahAudios)
            ..where((t) =>
                t.reciterAudioId.equals(reciterAudioId) & t.deletedAt.isNull())
            ..orderBy([(t) => OrderingTerm(expression: t.ayahOrder)]))
          .get();

  // استعلامات المحاضرين
  Future<List<QuranWikiLecturer>> getAllLecturers() =>
      (select(quranWikiLecturers)..where((t) => t.deletedAt.isNull())).get();

  Future<QuranWikiLecturer?> getLecturerById(int id) =>
      (select(quranWikiLecturers)..where((t) => t.id.equals(id)))
          .getSingleOrNull();

  // استعلامات المحاضرات
  Future<List<QuranWikiLecture>> getLecturesByLecturerId(int lecturerId) =>
      (select(quranWikiLectures)
            ..where((t) =>
                t.lecturerId.equals(lecturerId) & t.deletedAt.isNull())
            ..orderBy([(t) => OrderingTerm.desc(t.ordr)]))
          .get();

  Future<QuranWikiLecture?> getLectureById(int id) =>
      (select(quranWikiLectures)..where((t) => t.id.equals(id)))
          .getSingleOrNull();

  // استعلامات الفقرات
  Future<List<QuranWikiParagraph>> getParagraphsByLectureId(int lectureId) =>
      (select(quranWikiParagraphs)
            ..where((t) => t.lectureId.equals(lectureId) & t.deletedAt.isNull())
            ..orderBy([(t) => OrderingTerm(expression: t.ordr)]))
          .get();

  // استعلامات المفضلة
  Future<List<FavoriteAyah>> getAllFavoriteAyahs() =>
      select(favoriteAyahs).get();

  Future<bool> isAyahFavorite(int ayahId) =>
      (select(favoriteAyahs)..where((t) => t.ayahId.equals(ayahId)))
          .get()
          .then((list) => list.isNotEmpty);

  Future<int> addFavoriteAyah(int ayahId, int surahId) =>
      into(favoriteAyahs).insert(FavoriteAyahsCompanion(
        ayahId: Value(ayahId),
        surahId: Value(surahId),
        createdAt: Value(DateTime.now()),
      ));

  Future<int> removeFavoriteAyah(int ayahId) =>
      (delete(favoriteAyahs)..where((t) => t.ayahId.equals(ayahId))).go();

  // استعلامات المحاضرات المفضلة
  Future<List<FavoriteLecture>> getAllFavoriteLectures() =>
      select(favoriteLectures).get();

  Future<bool> isLectureFavorite(int lectureId) =>
      (select(favoriteLectures)..where((t) => t.lectureId.equals(lectureId)))
          .get()
          .then((list) => list.isNotEmpty);

  Future<int> addFavoriteLecture(int lectureId) =>
      into(favoriteLectures).insert(FavoriteLecturesCompanion(
        lectureId: Value(lectureId),
        createdAt: Value(DateTime.now()),
      ));

  Future<int> removeFavoriteLecture(int lectureId) =>
      (delete(favoriteLectures)..where((t) => t.lectureId.equals(lectureId)))
          .go();

  // استعلامات الختمات
  Future<List<Khitmah>> getAllKhitmahs() => select(khitmahs).get();

  Future<Khitmah?> getActiveKhitmah() =>
      (select(khitmahs)..where((t) => t.status.equals(0))).getSingleOrNull();

  Future<int> createKhitmah(KhitmahsCompanion khitmah) =>
      into(khitmahs).insert(khitmah);

  Future<bool> updateKhitmah(KhitmahsCompanion khitmah) =>
      update(khitmahs).replace(khitmah);

  // استعلامات نقاط التوقف
  Future<List<StopPoint>> getAllStopPoints() => select(stopPoints).get();

  Future<int> addStopPoint(int pageId, int? ayahId) =>
      into(stopPoints).insert(StopPointsCompanion(
        pageId: Value(pageId),
        ayahId: Value(ayahId),
        createdAt: Value(DateTime.now()),
        updatedAt: Value(DateTime.now()),
      ));

  Future<int> removeStopPoint(int id) =>
      (delete(stopPoints)..where((t) => t.id.equals(id))).go();

  // استعلامات برامج القراءة
  Future<List<ReadingProgram>> getAllReadingPrograms() =>
      (select(readingPrograms)..where((t) => t.approvalStatus.equals(1)))
          .get();

  Future<ReadingProgram?> getReadingProgramById(int id) =>
      (select(readingPrograms)..where((t) => t.id.equals(id)))
          .getSingleOrNull();

  // البحث في القرآن
  Future<List<QuranAyah>> searchInQuran(String query) {
    final lowerQuery = query.toLowerCase();
    return (select(quranAyahs)
          ..where((t) =>
              t.plainText.like('%$lowerQuery%') |
              t.quranText.like('%$lowerQuery%') |
              t.stem.like('%$lowerQuery%'))
          ..limit(100))
        .get();
  }

  // البحث في المحاضرات
  Future<List<QuranWikiLecture>> searchInLectures(String query) {
    final lowerQuery = query.toLowerCase();
    return (select(quranWikiLectures)
          ..where((t) =>
              t.title.like('%$lowerQuery%') |
              t.keywords.like('%$lowerQuery%') |
              t.shortContent.like('%$lowerQuery%'))
          ..limit(100))
        .get();
  }
}

LazyDatabase _openConnection() {
  return LazyDatabase(() async {
    final dbFolder = await getApplicationDocumentsDirectory();
    final file = File(p.join(dbFolder.path, 'huda_allah.db'));
    return NativeDatabase.createInBackground(file);
  });
}
