import 'package:dartz/dartz.dart';
import '../entities/quran_entities.dart';
import '../entities/audio_entities.dart';
import '../entities/lecture_entities.dart';
import '../entities/user_entities.dart';

/// أخطاء التطبيق
abstract class Failure {
  final String message;
  const Failure(this.message);
}

class ServerFailure extends Failure {
  const ServerFailure(super.message);
}

class CacheFailure extends Failure {
  const CacheFailure(super.message);
}

class NetworkFailure extends Failure {
  const NetworkFailure(super.message);
}

/// مستودع السور
abstract class SurahRepository {
  Future<Either<Failure, List<SurahEntity>>> getAllSurahs();
  Future<Either<Failure, SurahEntity>> getSurahById(int id);
  Future<Either<Failure, SurahEntity>> getSurahByMoshafOrder(int order);
}

/// مستودع الآيات
abstract class AyahRepository {
  Future<Either<Failure, List<AyahEntity>>> getAyahsBySurahId(int surahId);
  Future<Either<Failure, List<AyahEntity>>> getAyahsByPageId(int pageId);
  Future<Either<Failure, AyahEntity>> getAyahById(int id);
  Future<Either<Failure, List<AyahEntity>>> searchAyahs(String query);
}

/// مستودع الصفحات
abstract class PageRepository {
  Future<Either<Failure, List<PageEntity>>> getAllPages();
  Future<Either<Failure, PageEntity>> getPageByNumber(int pageNumber);
}

/// مستودع الأجزاء
abstract class JuzRepository {
  Future<Either<Failure, List<JuzEntity>>> getAllJuzs();
  Future<Either<Failure, JuzEntity>> getJuzByNumber(int juzNumber);
}

/// مستودع الأحزاب
abstract class HizbRepository {
  Future<Either<Failure, List<HizbEntity>>> getAllHizbs();
}

/// مستودع القراء
abstract class ReciterRepository {
  Future<Either<Failure, List<ReciterEntity>>> getAllReciters();
  Future<Either<Failure, ReciterEntity>> getReciterById(int id);
  Future<Either<Failure, List<RecitationEntity>>> getAllRecitations();
  Future<Either<Failure, List<ReciterTypeEntity>>> getReciterTypes(int reciterId);
  Future<Either<Failure, List<ReciterAudioEntity>>> getReciterAudios(int reciterId);
  Future<Either<Failure, List<AyahAudioEntity>>> getAyahAudios(int reciterAudioId);
}

/// مستودع المحاضرات
abstract class LectureRepository {
  Future<Either<Failure, List<LecturerEntity>>> getAllLecturers();
  Future<Either<Failure, LecturerEntity>> getLecturerById(int id);
  Future<Either<Failure, List<LectureEntity>>> getLecturesByLecturerId(int lecturerId);
  Future<Either<Failure, LectureEntity>> getLectureById(int id);
  Future<Either<Failure, List<ParagraphEntity>>> getParagraphsByLectureId(int lectureId);
  Future<Either<Failure, List<MediaEntity>>> getMediaByLectureId(int lectureId);
  Future<Either<Failure, List<AlbumEntity>>> getAlbumsByLecturerId(int lecturerId);
  Future<Either<Failure, List<LectureEntity>>> searchLectures(String query);
}

/// مستودع الختمات
abstract class KhitmahRepository {
  Future<Either<Failure, List<KhitmahEntity>>> getAllKhitmahs();
  Future<Either<Failure, KhitmahEntity?>> getActiveKhitmah();
  Future<Either<Failure, int>> createKhitmah(KhitmahEntity khitmah);
  Future<Either<Failure, void>> updateKhitmah(KhitmahEntity khitmah);
  Future<Either<Failure, void>> deleteKhitmah(int id);
  Future<Either<Failure, List<DailyQuotaEntity>>> getDailyQuotas(int khitmahId);
}

/// مستودع المفضلة
abstract class FavoriteRepository {
  // الآيات المفضلة
  Future<Either<Failure, List<FavoriteAyahEntity>>> getAllFavoriteAyahs();
  Future<Either<Failure, bool>> isAyahFavorite(int ayahId);
  Future<Either<Failure, void>> addFavoriteAyah(int ayahId, int surahId);
  Future<Either<Failure, void>> removeFavoriteAyah(int ayahId);

  // المحاضرات المفضلة
  Future<Either<Failure, List<FavoriteLectureEntity>>> getAllFavoriteLectures();
  Future<Either<Failure, bool>> isLectureFavorite(int lectureId);
  Future<Either<Failure, void>> addFavoriteLecture(int lectureId);
  Future<Either<Failure, void>> removeFavoriteLecture(int lectureId);
}

/// مستودع نقاط التوقف
abstract class StopPointRepository {
  Future<Either<Failure, List<StopPointEntity>>> getAllStopPoints();
  Future<Either<Failure, void>> addStopPoint(int pageId, int? ayahId);
  Future<Either<Failure, void>> removeStopPoint(int id);
}

/// مستودع برامج القراءة
abstract class ReadingProgramRepository {
  Future<Either<Failure, List<ReadingProgramEntity>>> getAllReadingPrograms();
  Future<Either<Failure, ReadingProgramEntity>> getReadingProgramById(int id);
}
