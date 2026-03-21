# دليل البناء الشامل - تطبيق هدى الله
# Complete Build Guide - Huda Allah Application

## نظرة عامة | Overview

هذا الدليل مخصص لأي نموذج ذكاء اصطناعي أو مطور يرغب في بناء تطبيق مشابه لتطبيق "هدى الله" - تطبيق قرآني شامل. تم استخراج هذه المعلومات من تحليل عكسي شامل للملفات الثنائية والكود المصدري.

This guide is designed for any AI model or developer who wants to build an application similar to "Huda Allah" - a comprehensive Quran application. This information was extracted from comprehensive reverse engineering analysis.

---

## المرحلة 1: إعداد البنية الأساسية | Phase 1: Foundation Setup

### 1.1 إنشاء مشروع Flutter

```bash
flutter create huda_allah_app --org com.hudaallah
cd huda_allah_app
```

### 1.2 هيكل المجلدات المطلوب

```
lib/
├── main.dart
├── src/
│   ├── core/
│   │   ├── api/
│   │   │   ├── api_client.dart
│   │   │   ├── api_config.dart
│   │   │   ├── api_endpoint.dart
│   │   │   └── api_interceptor.dart
│   │   ├── db/
│   │   │   ├── app_db.dart
│   │   │   ├── app_db.g.dart
│   │   │   └── tables/
│   │   ├── di/
│   │   │   └── injection.dart
│   │   ├── entities/
│   │   ├── models/
│   │   ├── utils/
│   │   ├── widgets/
│   │   └── settings/
│   ├── features/
│   │   ├── auth/
│   │   ├── backup/
│   │   ├── db_updates/
│   │   ├── init/
│   │   └── notification/
│   └── apps/
│       └── quran/
│           ├── core/
│           │   ├── db/
│           │   ├── entities/
│           │   ├── enums/
│           │   ├── models/
│           │   ├── notifications_handlers/
│           │   ├── providers/
│           │   ├── settings/
│           │   ├── utils/
│           │   └── widgets/
│           └── features/
│               ├── about_us/
│               ├── audio/
│               ├── ayah_groups/
│               ├── daily_ayah/
│               ├── daily_schedule/
│               ├── favorite_ayahs/
│               ├── favorite_lectures/
│               ├── khitmahs/
│               ├── lecture_downloads/
│               ├── lecture_media/
│               ├── lecture_paragraphs/
│               ├── lecture_search/
│               ├── lecture_stop_points/
│               ├── media_audio_player/
│               ├── notification/
│               ├── quran_audio_player/
│               ├── quran_display_mode/
│               ├── quran_downloads/
│               ├── quran_home/
│               ├── quran_index/
│               ├── quran_init/
│               ├── quran_interpretation/
│               ├── quran_lecture_groups/
│               ├── quran_lectures/
│               ├── quran_pages/
│               ├── quran_reading/
│               ├── quran_search/
│               ├── quran_settings/
│               ├── quran_share/
│               ├── quran_stop_points/
│               ├── reading_programs/
│               ├── reciters/
│               └── text_links/
```

### 1.3 الملفات المطلوبة في pubspec.yaml

```yaml
name: huda_allah_app
description: Comprehensive Quran Application

environment:
  sdk: '>=3.0.0 <4.0.0'

dependencies:
  flutter:
    sdk: flutter
  
  # State Management
  flutter_bloc: ^8.1.0
  equatable: ^2.0.5
  freezed_annotation: ^2.4.0
  
  # Dependency Injection
  get_it: ^7.6.0
  injectable: ^2.3.0
  
  # Database
  drift: ^2.14.0
  sqlite3_flutter_libs: ^0.5.0
  drift_flutter: ^0.1.0
  
  # Network
  dio: ^5.4.0
  retrofit: ^4.0.0
  cached_network_image: ^3.3.0
  
  # Audio
  just_audio: ^0.9.36
  audio_service: ^0.18.12
  audio_session: ^0.1.18
  
  # Notifications
  flutter_local_notifications: ^16.0.0
  
  # Downloads
  flutter_downloader: ^1.11.0
  
  # Background Tasks
  workmanager: ^0.5.0
  
  # Storage
  flutter_secure_storage: ^9.0.0
  shared_preferences: ^2.2.0
  
  # UI Components
  cupertino_icons: ^1.0.6
  font_awesome_flutter: ^10.6.0
  hugeicons: ^0.0.7
  flutter_widget_from_html_core: ^0.14.0
  extended_image: ^8.2.0
  scrollable_positioned_list: ^0.3.8
  
  # Utilities
  intl: ^0.18.0
  path_provider: ^2.1.0
  path: ^1.8.0
  url_launcher: ^6.2.0
  share_plus: ^7.2.0
  open_file: ^3.3.0
  wakelock_plus: ^1.1.0
  
  # Quran-specific
  quran: ^1.0.0  # For Arabic text processing

dev_dependencies:
  flutter_test:
    sdk: flutter
  build_runner: ^2.4.0
  drift_dev: ^2.14.0
  freezed: ^2.4.0
  injectable_generator: ^2.3.0
  retrofit_generator: ^8.0.0

flutter:
  uses-material-design: true
  
  assets:
    - assets/fonts/
    - assets/fonts/ElMessiri/
    - assets/images/
    - assets/images/decorations/
    - assets/images/icons/
    - assets/images/logos/
    - assets/images/misc/
    - assets/images/placeholders/
    - assets/images/quran_decorations/
    - assets/images/containers/
    - assets/json/
    - assets/db/
  
  fonts:
    - family: UthmanicHafs
      fonts:
        - asset: assets/fonts/UthmanicHafs.ttf
    - family: QCF_BSML
      fonts:
        - asset: assets/fonts/QCF_BSML.TTF
    - family: AbdoLine
      fonts:
        - asset: assets/fonts/AbdoLine.otf
    - family: Newmalazim
      fonts:
        - asset: assets/fonts/Newmalazim-Regular.otf
    - family: ElMessiri
      fonts:
        - asset: assets/fonts/ElMessiri/ElMessiri-Regular.ttf
        - asset: assets/fonts/ElMessiri/ElMessiri-Bold.ttf
          weight: 700
        - asset: assets/fonts/ElMessiri/ElMessiri-Medium.ttf
          weight: 500
        - asset: assets/fonts/ElMessiri/ElMessiri-SemiBold.ttf
          weight: 600
```

---

## المرحلة 2: قاعدة البيانات | Phase 2: Database Schema

### 2.1 الجداول الأساسية للقرآن

```dart
// lib/src/apps/quran/core/db/tables/quran_tables.dart

import 'package:drift/drift.dart';

// جدول السور
class QuranSurahs extends Table {
  IntColumn get id => integer().autoIncrement()();
  IntColumn get juzId => integer().nullable()();
  IntColumn get pageId => integer().nullable()();
  IntColumn get fallOrder => integer().nullable()();
  IntColumn get moshafOrder => integer().nullable()();
  IntColumn get ayahsCount => integer().nullable()();
  IntColumn get fallPlace => integer().nullable()(); // 0=مكية, 1=مدنية
  TextColumn get title => text().withLength(max: 50)();
  TextColumn get names => text().nullable()();
  TextColumn get info => text().nullable()();
  TextColumn get symbol => text().withLength(max: 5)();
  IntColumn get startAyahOrder => integer().nullable()();
}

// جدول الآيات
class QuranAyahs extends Table {
  IntColumn get id => integer().autoIncrement()();
  IntColumn get surahId => integer().nullable()();
  IntColumn get juzId => integer().nullable()();
  IntColumn get hizbId => integer().nullable()();
  IntColumn get pageId => integer().nullable()();
  IntColumn get hizbNumber => integer().nullable()();
  IntColumn get ayahOrder => integer().nullable()();
  IntColumn get ayahNumber => integer().nullable()();
  BoolColumn get isStartHizb => boolean().withDefault(const Constant(false))();
  BoolColumn get isStartJuz => boolean().withDefault(const Constant(false))();
  BoolColumn get hasProstration => boolean().withDefault(const Constant(false))();
  IntColumn get prostrationType => integer().nullable()();
  TextColumn get plainText => text().nullable()();
  TextColumn get quranText => text().nullable()();
  TextColumn get stem => text().nullable()();
}

// جدول الصفحات
class QuranPages extends Table {
  IntColumn get id => integer().autoIncrement()();
  IntColumn get startSurahId => integer().nullable()();
  IntColumn get startJuzId => integer().nullable()();
  IntColumn get startHizbId => integer().nullable()();
  IntColumn get hizbNumber => integer().nullable()();
  IntColumn get pageNumber => integer().nullable()();
  IntColumn get startAyahNumber => integer().nullable()();
  IntColumn get startAyahOrder => integer().nullable()();
}

// جدول الأجزاء
class QuranJuzs extends Table {
  IntColumn get id => integer().autoIncrement()();
  IntColumn get startSurahId => integer().nullable()();
  IntColumn get startPageId => integer().nullable()();
  IntColumn get juzNumber => integer().nullable()();
  IntColumn get startAyahNumber => integer().nullable()();
  TextColumn get firstAyahs => text().nullable()();
  IntColumn get startAyahOrder => integer().nullable()();
}

// جدول الأحزاب
class QuranHizbs extends Table {
  IntColumn get id => integer().autoIncrement()();
  IntColumn get juzId => integer().nullable()();
  IntColumn get surahId => integer().nullable()();
  IntColumn get startPageId => integer().nullable()();
  IntColumn get hizbNumber => integer().nullable()();
  IntColumn get segmentOrder => integer().nullable()();
  IntColumn get ayahNumber => integer().nullable()();
  TextColumn get firstAyahs => text().nullable()();
  IntColumn get startAyahOrder => integer().nullable()();
  IntColumn get approvalStatus => integer().nullable()();
}

// جدول القراء
class QuranReciters extends Table {
  IntColumn get id => integer().autoIncrement()();
  DateTimeColumn get deletedAt => dateTime().nullable()();
  DateTimeColumn get createdAt => dateTime().nullable()();
  DateTimeColumn get updatedAt => dateTime().nullable()();
  TextColumn get name => text().nullable()();
  BoolColumn get isComplete => boolean().withDefault(const Constant(false))();
  IntColumn get approvalStatus => integer().nullable()();
  IntColumn get countryId => integer().nullable()();
  TextColumn get profile => text().withLength(max: 100).nullable()();
}

// جدول التلاوات
class QuranRecitations extends Table {
  IntColumn get id => integer().autoIncrement()();
  DateTimeColumn get deletedAt => dateTime().nullable()();
  DateTimeColumn get createdAt => dateTime().nullable()();
  DateTimeColumn get updatedAt => dateTime().nullable()();
  TextColumn get name => text().withLength(max: 50)();
  BoolColumn get isActive => boolean().withDefault(const Constant(false))();
}

// جدول أنواع القراء
class QuranReciterTypes extends Table {
  IntColumn get id => integer().autoIncrement()();
  DateTimeColumn get deletedAt => dateTime().nullable()();
  DateTimeColumn get createdAt => dateTime().nullable()();
  DateTimeColumn get updatedAt => dateTime().nullable()();
  IntColumn get reciterId => integer().nullable()();
  IntColumn get recitationId => integer().nullable()();
  IntColumn get approvalStatus => integer().nullable()();
}

// جدول ملفات الصوت للسور
class QuranReciterAudios extends Table {
  IntColumn get id => integer().autoIncrement()();
  DateTimeColumn get deletedAt => dateTime().nullable()();
  DateTimeColumn get createdAt => dateTime().nullable()();
  DateTimeColumn get updatedAt => dateTime().nullable()();
  IntColumn get reciterId => integer().nullable()();
  IntColumn get surahId => integer().nullable()();
  IntColumn get reciterTypeId => integer().nullable()();
  TextColumn get audio => text().withLength(max: 100)();
  IntColumn get approvalStatus => integer().nullable()();
  BoolColumn get isComplete => boolean().withDefault(const Constant(false))();
}

// جدول ملفات الصوت للآيات (Gapless Playback)
class QuranAyahAudios extends Table {
  IntColumn get id => integer().autoIncrement()();
  DateTimeColumn get deletedAt => dateTime().nullable()();
  DateTimeColumn get createdAt => dateTime().nullable()();
  DateTimeColumn get updatedAt => dateTime().nullable()();
  IntColumn get reciterAudioId => integer().nullable()();
  IntColumn get reciterId => integer().nullable()();
  IntColumn get surahId => integer().nullable()();
  IntColumn get ayahId => integer().nullable()();
  IntColumn get ayahOrder => integer().nullable()();
  IntColumn get reciterTypeId => integer().nullable()();
  TextColumn get audio => text().withLength(max: 100)();
  IntColumn get startTime => integer().nullable()(); // بالمللي ثانية
  IntColumn get endTime => integer().nullable()(); // بالمللي ثانية
}

// جدول الحروف/ال glyphs
class QuranGlyphs extends Table {
  IntColumn get id => integer().autoIncrement()();
  IntColumn get code => integer().nullable()();
  IntColumn get ayahId => integer().nullable()();
  IntColumn get ayahNumber => integer().nullable()();
  IntColumn get ayahOrder => integer().nullable()();
  IntColumn get surahId => integer().nullable()();
  IntColumn get pageId => integer().nullable()();
  IntColumn get lineNumber => integer().nullable()();
  IntColumn get glyphTypeId => integer().nullable()();
  IntColumn get hizbId => integer().nullable()();
  IntColumn get juzId => integer().nullable()();
  IntColumn get hizbNumber => integer().nullable()();
  IntColumn get hasProstration => integer().nullable()();
  IntColumn get prostrationType => integer().nullable()();
}
```

### 2.2 جداول المحاضرات والويكي

```dart
// lib/src/apps/quran/core/db/tables/wiki_tables.dart

import 'package:drift/drift.dart';

// جدول المحاضرين
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

// جدول المحاضرات
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

// جدول الفقرات
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

// جدول الوسائط
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

// جدول الألبومات
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
```

### 2.3 جداول الميزات الشخصية

```dart
// lib/src/apps/quran/core/db/tables/user_tables.dart

import 'package:drift/drift.dart';

// جدول الختمات
class Khitmahs extends Table {
  IntColumn get id => integer().autoIncrement()();
  TextColumn get name => text().nullable()();
  IntColumn get divisionUnit => integer().nullable()(); // 0=صفحات, 1=أجزاء, 2=سور
  IntColumn get status => integer().nullable()(); // 0=نشط, 1=متوقف, 2=مكتمل
  DateTimeColumn get startDate => dateTime().nullable()();
  DateTimeColumn get endDate => dateTime().nullable()();
  IntColumn get reminderTime => integer().nullable()(); // بالدقائق من منتصف الليل
  TextColumn get cover => text().withLength(max: 100).nullable()();
}

// جدول الحصص اليومية
class KhitmahDailyQuotas extends Table {
  IntColumn get id => integer().autoIncrement()();
  IntColumn get khitmahId => integer().nullable()();
  DateTimeColumn get date => dateTime().nullable()();
  IntColumn get fromRecordId => integer().nullable()();
  IntColumn get toRecordId => integer().nullable()();
  BoolColumn get isCompleted => boolean().withDefault(const Constant(false))();
}

// جدول الآيات المفضلة
class FavoriteAyahs extends Table {
  IntColumn get id => integer().autoIncrement()();
  IntColumn get ayahId => integer().nullable()();
  IntColumn get surahId => integer().nullable()();
  DateTimeColumn get createdAt => dateTime().nullable()();
}

// جدول المحاضرات المفضلة
class FavoriteLectures extends Table {
  IntColumn get id => integer().autoIncrement()();
  IntColumn get lectureId => integer().nullable()();
  DateTimeColumn get createdAt => dateTime().nullable()();
}

// جدول مجموعات الآيات
class AyahGroups extends Table {
  IntColumn get id => integer().autoIncrement()();
  TextColumn get name => text().nullable()();
  TextColumn get description => text().nullable()();
  DateTimeColumn get createdAt => dateTime().nullable()();
  DateTimeColumn get updatedAt => dateTime().nullable()();
}

// جدول آيات المجموعات
class AyahGroupAyahs extends Table {
  IntColumn get id => integer().autoIncrement()();
  IntColumn get ayahGroupId => integer().nullable()();
  IntColumn get ayahId => integer().nullable()();
  IntColumn get ordr => integer().nullable()();
  DateTimeColumn get createdAt => dateTime().nullable()();
}

// جدول نقاط التوقف
class StopPoints extends Table {
  IntColumn get id => integer().autoIncrement()();
  IntColumn get pageId => integer().nullable()();
  IntColumn get ayahId => integer().nullable()();
  DateTimeColumn get createdAt => dateTime().nullable()();
  DateTimeColumn get updatedAt => dateTime().nullable()();
}

// جدول برامج القراءة
class ReadingPrograms extends Table {
  IntColumn get id => integer().autoIncrement()();
  TextColumn get name => text().nullable()();
  TextColumn get cover => text().withLength(max: 100).nullable()();
  IntColumn get reminderTime => integer().nullable()();
  DateTimeColumn get startDate => dateTime().nullable()();
  DateTimeColumn get publishDate => dateTime().nullable()();
  IntColumn get approvalStatus => integer().nullable()();
  BoolColumn get isComplete => boolean().withDefault(const Constant(false))();
}
```

---

## المرحلة 3: تكوين API | Phase 3: API Configuration

### 3.1 API Client

```dart
// lib/src/core/api/api_config.dart

class ApiConfig {
  static const String baseUrl = 'https://your-domain.com/api/';
  static const Duration connectTimeout = Duration(seconds: 30);
  static const Duration receiveTimeout = Duration(seconds: 30);
  static const Duration sendTimeout = Duration(seconds: 30);
}

// lib/src/core/api/api_client.dart

import 'package:dio/dio.dart';
import 'api_config.dart';
import 'api_interceptor.dart';

class ApiClient {
  late final Dio _dio;
  
  ApiClient() {
    _dio = Dio(
      BaseOptions(
        baseUrl: ApiConfig.baseUrl,
        connectTimeout: ApiConfig.connectTimeout,
        receiveTimeout: ApiConfig.receiveTimeout,
        sendTimeout: ApiConfig.sendTimeout,
        headers: {
          'Content-Type': 'application/json',
          'Accept': 'application/json',
        },
      ),
    );
    
    _dio.interceptors.addAll([
      ApiInterceptor(),
      LogInterceptor(
        requestBody: true,
        responseBody: true,
        error: true,
      ),
    ]);
  }
  
  Dio get dio => _dio;
}

// lib/src/core/api/api_interceptor.dart

import 'package:dio/dio.dart';
import 'package:flutter_secure_storage/flutter_secure_storage.dart';

class ApiInterceptor extends Interceptor {
  final FlutterSecureStorage _storage = const FlutterSecureStorage();
  
  @override
  void onRequest(RequestOptions options, RequestInterceptorHandler handler) async {
    final token = await _storage.read(key: 'access_token');
    if (token != null) {
      options.headers['Authorization'] = 'Bearer $token';
    }
    handler.next(options);
  }
  
  @override
  void onError(DioException err, ErrorInterceptorHandler handler) async {
    if (err.response?.statusCode == 401) {
      // Handle token refresh
      final refreshToken = await _storage.read(key: 'refresh_token');
      if (refreshToken != null) {
        // Attempt token refresh
        // If successful, retry the request
        // If failed, logout user
      }
    }
    handler.next(err);
  }
}
```

### 3.2 Endpoints المطلوبة

```dart
// lib/src/core/api/api_endpoint.dart

class ApiEndpoint {
  // Authentication
  static const String login = 'auth/login';
  static const String signup = 'auth/signup';
  static const String refreshToken = 'auth/refresh';
  static const String logout = 'auth/logout';
  static const String currentUser = 'user/me';
  
  // Database Updates
  static const String checkDbVersions = 'db/check-versions';
  static const String downloadDbFiles = 'db/files';
  
  // Quran
  static const String surahs = 'quran/surahs';
  static const String ayahs = 'quran/ayahs';
  static const String pages = 'quran/pages';
  static const String juzs = 'quran/juzs';
  static const String hizbs = 'quran/hizbs';
  static const String search = 'quran/search';
  static const String interpretation = 'quran/interpretation';
  
  // Reciters
  static const String reciters = 'reciters';
  static const String recitations = 'recitations';
  static const String reciterAudios = 'reciters/{id}/audios';
  
  // Lectures
  static const String lectures = 'lectures';
  static const String lectureDetails = 'lectures/{id}';
  static const String lectureParagraphs = 'lectures/{id}/paragraphs';
  static const String lectureMedia = 'lectures/{id}/media';
  static const String lecturers = 'lecturers';
  static const String albums = 'albums';
  
  // Daily Content
  static const String dailyAyah = 'daily-ayah';
  
  // Reading Programs
  static const String readingPrograms = 'reading-programs';
  static const String subscribeProgram = 'reading-programs/{id}/subscribe';
  
  // User Data
  static const String favoriteAyahs = 'user/favorite-ayahs';
  static const String favoriteLectures = 'user/favorite-lectures';
  static const String ayahGroups = 'user/ayah-groups';
  static const String khitmahs = 'user/khitmahs';
  static const String stopPoints = 'user/stop-points';
}
```

---

## المرحلة 4: إدارة الحالة BLoC | Phase 4: State Management

### 4.1 هيكل BLoC لكل ميزة

```dart
// مثال: lib/src/apps/quran/features/quran_audio_player/presentation/manager/bloc/quran_audio_player_bloc.dart

import 'package:flutter_bloc/flutter_bloc.dart';
import 'package:freezed_annotation/freezed_annotation.dart';

part 'quran_audio_player_event.dart';
part 'quran_audio_player_state.dart';
part 'quran_audio_player_bloc.freezed.dart';

class QuranAudioPlayerBloc 
    extends Bloc<QuranAudioPlayerEvent, QuranAudioPlayerState> {
  
  final PlayAyahAudioUseCase _playAyahAudioUseCase;
  final GetAyahAudiosUseCase _getAyahAudiosUseCase;
  final GetAudioStateUseCase _getAudioStateUseCase;
  
  QuranAudioPlayerBloc({
    required PlayAyahAudioUseCase playAyahAudioUseCase,
    required GetAyahAudiosUseCase getAyahAudiosUseCase,
    required GetAudioStateUseCase getAudioStateUseCase,
  })  : _playAyahAudioUseCase = playAyahAudioUseCase,
        _getAyahAudiosUseCase = getAyahAudiosUseCase,
        _getAudioStateUseCase = getAudioStateUseCase,
        super(const QuranAudioPlayerState.initial()) {
    
    on<LoadAyahAudios>(_onLoadAyahAudios);
    on<PlayAyahAudio>(_onPlayAyahAudio);
    on<PauseAudio>(_onPauseAudio);
    on<ResumeAudio>(_onResumeAudio);
    on<StopAudio>(_onStopAudio);
    on<NextAyah>(_onNextAyah);
    on<PreviousAyah>(_onPreviousAyah);
    on<PlaybackStateChanged>(_onPlaybackStateChanged);
  }
  
  Future<void> _onLoadAyahAudios(
    LoadAyahAudios event,
    Emitter<QuranAudioPlayerState> emit,
  ) async {
    emit(const QuranAudioPlayerState.loading());
    
    final result = await _getAyahAudiosUseCase(
      GetAyahAudiosParams(
        surahId: event.surahId,
        reciterId: event.reciterId,
        recitationId: event.recitationId,
      ),
    );
    
    result.fold(
      (failure) => emit(QuranAudioPlayerState.error(failure.message)),
      (ayahAudios) => emit(QuranAudioPlayerState.loaded(
        ayahAudios: ayahAudios,
        currentIndex: 0,
      )),
    );
  }
  
  // ... باقي الأحداث
}

// QuranAudioPlayerEvent
@freezed
class QuranAudioPlayerEvent with _$QuranAudioPlayerEvent {
  const factory QuranAudioPlayerEvent.loadAyahAudios({
    required int surahId,
    required int reciterId,
    required int recitationId,
  }) = LoadAyahAudios;
  
  const factory QuranAudioPlayerEvent.playAyahAudio({
    required int ayahIndex,
  }) = PlayAyahAudio;
  
  const factory QuranAudioPlayerEvent.pauseAudio() = PauseAudio;
  const factory QuranAudioPlayerEvent.resumeAudio() = ResumeAudio;
  const factory QuranAudioPlayerEvent.stopAudio() = StopAudio;
  const factory QuranAudioPlayerEvent.nextAyah() = NextAyah;
  const factory QuranAudioPlayerEvent.previousAyah() = PreviousAyah;
  const factory QuranAudioPlayerEvent.playbackStateChanged({
    required AudioButtonState buttonState,
    required Duration position,
    required Duration duration,
  }) = PlaybackStateChanged;
}

// QuranAudioPlayerState
@freezed
class QuranAudioPlayerState with _$QuranAudioPlayerState {
  const factory QuranAudioPlayerState.initial() = Initial;
  const factory QuranAudioPlayerState.loading() = Loading;
  const factory QuranAudioPlayerState.loaded({
    required List<AyahAudioEntity> ayahAudios,
    required int currentIndex,
    AudioButtonState? buttonState,
    Duration? position,
    Duration? duration,
  }) = Loaded;
  const factory QuranAudioPlayerState.playing({
    required List<AyahAudioEntity> ayahAudios,
    required int currentIndex,
    required Duration position,
    required Duration duration,
  }) = Playing;
  const factory QuranAudioPlayerState.paused({
    required List<AyahAudioEntity> ayahAudios,
    required int currentIndex,
    required Duration position,
    required Duration duration,
  }) = Paused;
  const factory QuranAudioPlayerState.error(String message) = Error;
}
```

### 4.2 قائمة BLoCs المطلوبة

| Feature | BLoC Name | Purpose |
|---------|-----------|---------|
| Auth | AuthBloc | User authentication state |
| Quran Audio | QuranAudioPlayerBloc | Quran playback control |
| Reciters | RecitersSelectionBloc | Reciter selection |
| Default Reciter | DefaultReciterTypeBloc | Default reciter settings |
| Quran Pages | QuranPageBloc | Page navigation |
| Quran Search | QuranSearchBloc | Search queries |
| Khitmahs | KhitmahsBloc | Quran completion programs |
| Khitmah Quotas | KhitmahQuotasBloc | Daily quotas tracking |
| Daily Ayah | DailyAyahBloc | Daily verse management |
| Favorites (Ayahs) | FavoriteAyahsBloc | Bookmarked verses |
| Favorites (Lectures) | FavoriteLecturesBloc | Bookmarked lectures |
| Ayah Groups | AyahGroupsBloc | Custom verse collections |
| Lecture Details | LectureDetailsBloc | Lecture content loading |
| Lecture Audio | LectureAudiosBloc | Lecture audio playback |
| Media Player | MediaAudioPlayerBloc | General media playback |
| DB Updates | DbUpdatesBloc | Database synchronization |
| Notifications | NotificationBloc | Notification management |
| Stop Points | LectureStopPointBloc | Reading progress |
| Interpretation | QuranInterpretationBloc | Tafsir content |
| Index | JuzsIndexBloc | Juz navigation |

---

## المرحلة 5: خدمات الصوت | Phase 5: Audio Service

### 5.1 تكوين Audio Handler

```dart
// lib/src/apps/quran/features/quran_audio_player/data/services/audio_handler.dart

import 'package:audio_service/audio_service.dart';
import 'package:just_audio/just_audio.dart';

class QuranAudioHandler extends BaseAudioHandler with QueueHandler, SeekHandler {
  final AudioPlayer _player = AudioPlayer();
  
  QuranAudioHandler() {
    _player.playbackEventStream.map(_transformEvent).pipe(playbackState);
    
    _player.processingStateStream.listen((state) {
      if (state == ProcessingState.completed) {
        _handleCompletion();
      }
    });
  }
  
  PlaybackState _transformEvent(PlaybackEvent event) {
    return PlaybackState(
      controls: [
        MediaControl.skipToPrevious,
        MediaControl.rewind,
        _player.playing ? MediaControl.pause : MediaControl.play,
        MediaControl.fastForward,
        MediaControl.skipToNext,
      ],
      systemActions: const {
        MediaAction.seek,
        MediaAction.seekForward,
        MediaAction.seekBackward,
      },
      androidCompactActionIndices: const [1, 2, 3],
      processingState: const {
        ProcessingState.idle: AudioProcessingState.idle,
        ProcessingState.loading: AudioProcessingState.loading,
        ProcessingState.buffering: AudioProcessingState.buffering,
        ProcessingState.ready: AudioProcessingState.ready,
        ProcessingState.completed: AudioProcessingState.completed,
      }[_player.processingState]!,
      playing: _player.playing,
      updatePosition: _player.position,
      bufferedPosition: _player.bufferedPosition,
      speed: _player.speed,
      queueIndex: event.currentIndex,
    );
  }
  
  @override
  Future<void> play() => _player.play();
  
  @override
  Future<void> pause() => _player.pause();
  
  @override
  Future<void> stop() async {
    await _player.stop();
    return super.stop();
  }
  
  @override
  Future<void> seek(Duration position) => _player.seek(position);
  
  @override
  Future<void> setSpeed(double speed) => _player.setSpeed(speed);
  
  Future<void> playAyahAudio(String url, {Duration? initialPosition}) async {
    await _player.setUrl(url);
    if (initialPosition != null) {
      await _player.seek(initialPosition);
    }
    await _player.play();
  }
  
  // Gapless playback support
  Future<void> setAyahAudiosWithTiming(List<String> urls, List<int> startTimes, List<int> endTimes) async {
    // Implementation for gapless playback using concatenated audio
    // with precise timing data
  }
}
```

---

## المرحلة 6: الإشعارات | Phase 6: Notifications

### 6.1 تكوين الإشعارات المحلية

```dart
// lib/src/features/notification/data/services/notification_service.dart

import 'package:flutter_local_notifications/flutter_local_notifications.dart';
import 'package:timezone/timezone.dart' as tz;

class NotificationService {
  final FlutterLocalNotificationsPlugin _notifications = 
      FlutterLocalNotificationsPlugin();
  
  Future<void> initialize() async {
    const androidSettings = AndroidInitializationSettings('@mipmap/ic_launcher');
    const iosSettings = DarwinInitializationSettings(
      requestAlertPermission: true,
      requestBadgePermission: true,
      requestSoundPermission: true,
    );
    
    const initSettings = InitializationSettings(
      android: androidSettings,
      iOS: iosSettings,
    );
    
    await _notifications.initialize(
      initSettings,
      onDidReceiveNotificationResponse: _onNotificationTapped,
    );
  }
  
  Future<void> scheduleDailyAyahNotification({
    required int id,
    required String title,
    required String body,
    required TimeOfDay time,
  }) async {
    await _notifications.zonedSchedule(
      id,
      title,
      body,
      _nextInstanceOfTime(time.hour, time.minute),
      const NotificationDetails(
        android: AndroidNotificationDetails(
          'daily_ayah',
          'الآية اليومية',
          channelDescription: 'إشعارات الآية اليومية',
          importance: Importance.high,
          priority: Priority.high,
          icon: '@mipmap/ic_launcher',
        ),
        iOS: DarwinNotificationDetails(
          presentAlert: true,
          presentBadge: true,
          presentSound: true,
        ),
      ),
      androidScheduleMode: AndroidScheduleMode.exactAllowWhileIdle,
      uiLocalNotificationDateInterpretation: UILocalNotificationDateInterpretation.absoluteTime,
    );
  }
  
  Future<void> scheduleKhitmahReminder({
    required int khitmahId,
    required String title,
    required String body,
    required TimeOfDay time,
  }) async {
    // Schedule daily reminder for khitmah
  }
  
  Future<void> scheduleProgramReminder({
    required int programId,
    required String title,
    required String body,
    required DateTime date,
    required TimeOfDay time,
  }) async {
    // Schedule reminder for reading program
  }
  
  tz.TZDateTime _nextInstanceOfTime(int hour, int minute) {
    final now = tz.TZDateTime.now(tz.local);
    var scheduledDate = tz.TZDateTime(tz.local, now.year, now.month, now.day, hour, minute);
    if (scheduledDate.isBefore(now)) {
      scheduledDate = scheduledDate.add(const Duration(days: 1));
    }
    return scheduledDate;
  }
  
  void _onNotificationTapped(NotificationResponse response) {
    // Handle notification tap
    final payload = response.payload;
    if (payload != null) {
      // Navigate to relevant screen based on payload
    }
  }
}
```

---

## المرحلة 7: الأصول المطلوبة | Phase 7: Required Assets

### 7.1 الخطوط المطلوبة

```
assets/fonts/
├── UthmanicHafs.ttf          # خط المصحف الرئيسي
├── QCF_BSML.TTF              # خط البسملة
├── AbdoLine.otf              # خط الزخرفة
├── Newmalazim-Regular.otf    # خط الأرقام
└── ElMessiri/
    ├── ElMessiri-Regular.ttf
    ├── ElMessiri-Bold.ttf
    ├── ElMessiri-Medium.ttf
    └── ElMessiri-SemiBold.ttf
```

### 7.2 صور الزخرفة القرآنية

```
assets/images/quran_decorations/
├── madani.svg              # مؤشر السورة المدنية
├── makki.svg               # مؤشر السورة المكية
├── surah_name.svg          # قالب اسم السورة
├── page_header.svg         # ترويسة الصفحة
├── page_number.svg         # رقم الصفحة
├── hizb_start.png          # بداية الحزب
├── hizb_quarter.png        # ربع الحزب
├── hizb_half.png           # نصف الحزب
├── hizb_three_quarters.png # ثلاثة أرباع الحزب
├── hizb_segment.svg        # جزء الحزب
├── initial_page_middle_dark.png
├── initial_page_middle_light.png
├── initial_page_header_footer_dark.png
└── initial_page_header_footer_light.png
```

### 7.3 ملفات البيانات

```
assets/
├── json/
│   └── jathr_words.json    # قاموس الجذور للبحث الصرفي
└── db/
    └── main_db.zip         # قاعدة البيانات الأولية
```

---

## المرحلة 8: AndroidManifest | Phase 8: Android Configuration

### 8.1 AndroidManifest.xml

```xml
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    package="com.hudaallah.app">
    
    <!-- Network -->
    <uses-permission android:name="android.permission.INTERNET"/>
    <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE"/>
    
    <!-- Audio Playback -->
    <uses-permission android:name="android.permission.WAKE_LOCK"/>
    <uses-permission android:name="android.permission.FOREGROUND_SERVICE"/>
    <uses-permission android:name="android.permission.FOREGROUND_SERVICE_MEDIA_PLAYBACK"/>
    
    <!-- Notifications -->
    <uses-permission android:name="android.permission.POST_NOTIFICATIONS"/>
    <uses-permission android:name="android.permission.VIBRATE"/>
    
    <!-- Boot -->
    <uses-permission android:name="android.permission.RECEIVE_BOOT_COMPLETED"/>
    
    <!-- Storage -->
    <uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE"
        android:maxSdkVersion="32"/>
    <uses-permission android:name="android.permission.READ_MEDIA_AUDIO"/>
    <uses-permission android:name="android.permission.READ_MEDIA_VIDEO"/>
    <uses-permission android:name="android.permission.READ_MEDIA_IMAGES"/>
    
    <application
        android:label="هدى الله"
        android:name="${applicationName}"
        android:icon="@mipmap/ic_launcher">
        
        <!-- Main Activity -->
        <activity
            android:name=".MainActivity"
            android:exported="true"
            android:launchMode="singleTop"
            android:theme="@style/LaunchTheme"
            android:configChanges="orientation|keyboardHidden|keyboard|screenSize|smallestScreenSize|locale|layoutDirection|fontScale|screenLayout|density|uiMode"
            android:hardwareAccelerated="true"
            android:windowSoftInputMode="adjustResize">
            <meta-data
                android:name="io.flutter.embedding.android.NormalTheme"
                android:resource="@style/NormalTheme"/>
            <intent-filter>
                <action android:name="android.intent.action.MAIN"/>
                <category android:name="android.intent.category.LAUNCHER"/>
            </intent-filter>
        </activity>
        
        <!-- Audio Service -->
        <service
            android:name="com.ryanheise.audioservice.AudioService"
            android:exported="true"
            android:foregroundServiceType="mediaPlayback">
            <intent-filter>
                <action android:name="android.media.browse.MediaBrowserService"/>
            </intent-filter>
        </service>
        
        <receiver
            android:name="com.ryanheise.audioservice.MediaButtonReceiver"
            android:exported="true">
            <intent-filter>
                <action android:name="android.intent.action.MEDIA_BUTTON"/>
            </intent-filter>
        </receiver>
        
        <!-- Notification Receivers -->
        <receiver
            android:name="com.dexterous.flutterlocalnotifications.ScheduledNotificationReceiver"
            android:exported="false"/>
        
        <receiver
            android:name="com.dexterous.flutterlocalnotifications.ScheduledNotificationBootReceiver"
            android:exported="false">
            <intent-filter>
                <action android:name="android.intent.action.BOOT_COMPLETED"/>
                <action android:name="android.intent.action.MY_PACKAGE_REPLACED"/>
            </intent-filter>
        </receiver>
        
        <!-- Download Receiver -->
        <receiver
            android:name="vn.hunghd.flutterdownloader.DownloadedReceiver"
            android:exported="true"
            android:permission="android.permission.BIND_JOB_SERVICE"/>
        
        <!-- Flutter Metadata -->
        <meta-data
            android:name="flutterEmbedding"
            android:value="2"/>
        
    </application>
</manifest>
```

---

## المرحلة 9: خطوات التنفيذ | Phase 9: Implementation Steps

### الخطوة 1: إنشاء المشروع والبنية الأساسية
1. إنشاء مشروع Flutter جديد
2. إضافة الـ dependencies المطلوبة
3. إنشاء هيكل المجلدات
4. تكوين ملفات التكوين الأساسية

### الخطوة 2: قاعدة البيانات
1. تعريف الجداول باستخدام Drift
2. إنشاء ملفات الـ migration
3. إنشاء قاعدة بيانات أولية بالبيانات القرآنية
4. تنفيذ الـ data sources المحلية

### الخطوة 3: الـ API والشبكة
1. إنشاء API Client
2. تعريف الـ endpoints
3. تنفيذ الـ interceptors للمصادقة
4. إنشاء الـ models للـ serialization

### الخطوة 4: الميزات الأساسية
1. واجهة عرض القرآن
2. التنقل بين الصفحات
3. فهرس السور والأجزاء
4. البحث في القرآن

### الخطوة 5: الصوت والتلاوات
1. تكوين Audio Service
2. تشغيل التلاوات
3. تحديد القارئ والتلاوة
4. التحميل للعمل offline

### الخطوة 6: الميزات الشخصية
1. نظام الختمات
2. الآية اليومية
3. المفضلات
4. نقاط التوقف

### الخطوة 7: المحتوى الإضافي
1. عرض المحاضرات
2. الوسائط المتعددة
3. التفسير

### الخطوة 8: التحسينات
1. الإشعارات
2. التحميل في الخلفية
3. مزامنة البيانات

---

## ملاحظات مهمة للمطورين

1. **قاعدة البيانات**: يجب توفير ملف قاعدة بيانات مُعد مسبقاً يحتوي على:
   - نصوص الآيات القرآنية
   - معلومات السور والأجزاء والأحزاب
   - بيانات القراء والتلاوات
   - مواقيت الصوت للتشغيل المتصل

2. **الخطوط**: يجب الحصول على تراخيص استخدام الخطوط القرآنية

3. **المحتوى**: يجب التأكد من صحة المحتوى القرآني والتلاوات

4. **الـ API**: يجب بناء Backend مناسب يدعم جميع endpoints المذكورة

5. **الأداء**: الانتباه لتحسين أداء:
   - تحميل الصفحات
   - تشغيل الصوت
   - البحث
   - التحميلات

---

## الدعم والمراجع

للاستفسارات والمراجع التقنية، يرجى الرجوع إلى:
- مجلد `analysis_output/` للتحليلات التفصيلية
- مجلد `reverse_analysis_input/` للملفات الأصلية
- ملف `DATABASE_SCHEMA.md` لتفاصيل قاعدة البيانات

---

*تم إنشاء هذا الدليل لغرض تعليمي وبناء تطبيق مشابه بطريقة مشروعة ونظيفة.*
