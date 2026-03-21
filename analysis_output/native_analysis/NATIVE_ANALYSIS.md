# Native Library Analysis - Huda Allah Application

## Overview

This document details the analysis of native libraries extracted from the APK, including strings classification, package paths, and architectural insights.

---

## Library Inventory

| Library | Size (arm64-v8a) | Purpose |
|---------|-----------------|---------|
| libflutter.so | ~20 MB | Flutter engine with Skia renderer, Dart VM |
| libapp.so | ~15 MB | AOT-compiled Dart application code |
| libsqlite3.so | ~1 MB | Custom SQLite build with FTS5 support |
| libdatastore_shared_counter.so | ~50 KB | Atomic counter for shared preferences |

### Supported Architectures
- **arm64-v8a**: 64-bit ARM (modern devices)
- **armeabi-v7a**: 32-bit ARM (legacy devices)
- **x86_64**: 64-bit Intel (emulators)

---

## Strings Classification

### 1. Authentication & Security

```
# Authentication Tokens
accessToken
accessTokenExpiryDate
refreshToken
refreshTokenExpiryDate
userId

# Authentication Types
Bearer
Authorization
Bearer [token]

# User Model Fields
username
name
email
password
```

### 2. API & Network

```
# Base URL (CONFIRMED)
https://hudaallah.tabsera.ye/app_services/

# Contact
info@tabsera.com.ye

# HTTP Client
Dio
DioMixin
CancelToken
RequestOptions
BaseOptions
```

### 3. Package Structure

```
# Main Package
package:hqp_mobile_app/

# Core Modules
package:hqp_mobile_app/main.dart
package:hqp_mobile_app/src/core/api/api_client.dart
package:hqp_mobile_app/src/core/api/api_config.dart
package:hqp_mobile_app/src/core/api/api_endpoint.dart
package:hqp_mobile_app/src/core/api/api_interceptor.dart
package:hqp_mobile_app/src/core/db/user/user_db.dart
package:hqp_mobile_app/src/core/errors/api_exceptions.dart
```

### 4. Feature Packages

```
# Quran Core
package:hqp_mobile_app/src/apps/quran/core/db/quran_db.dart
package:hqp_mobile_app/src/apps/quran/core/entities/ayah_entity.dart
package:hqp_mobile_app/src/apps/quran/core/entities/surah_entity.dart
package:hqp_mobile_app/src/apps/quran/core/entities/glyph_entity.dart
package:hqp_mobile_app/src/apps/quran/core/models/ayah_model.dart
package:hqp_mobile_app/src/apps/quran/core/fonts/quran_fonts_service.dart

# Features (37 identified)
features/about_us
features/audio
features/auth
features/ayah_groups
features/backup
features/daily_ayah
features/daily_schedule
features/db_updates
features/favorite_ayahs
features/favorite_lectures
features/init
features/khitmahs
features/lecture_downloads
features/lecture_media
features/lecture_paragraphs
features/lecture_search
features/lecture_stop_points
features/media_audio_player
features/notification
features/quran_audio_player
features/quran_display_mode
features/quran_downloads
features/quran_home
features/quran_index
features/quran_init
features/quran_interpretation
features/quran_lecture_groups
features/quran_lectures
features/quran_pages
features/quran_reading
features/quran_search
features/quran_settings
features/quran_share
features/quran_stop_points
features/reading_programs
features/reciters
features/text_links
```

### 5. State Management (BLoC)

```
# Base Classes
Bloc
BlocBase
BlocBuilder
BlocConsumer
BlocListener
BlocProvider
BlocObserver

# Authentication
AuthBloc
AuthEvent
AuthState

# Audio Player
QuranAudioPlayerBloc
AyahAudiosBloc
AyahAudioFilesBloc
AyahAudioDownloadsBloc

# Khitmahs
KhitmahsBloc
CurrentKhitmahsBloc
FinishedKhitmahsBloc
KhitmahQuotasBloc

# Daily Content
DailyAyahBloc

# Favorites
FavoriteAyahsBloc
FavoriteLecturesBloc

# Lectures
LectureDetailsBloc
LectureAudiosBloc
LectureGroupLecturesBloc

# Search
SearchSurahsBloc
LectureSearchBloc

# Navigation
AutoScrollBloc
JuzsIndexBloc

# Settings
DefaultReciterTypeBloc

# Database
DbUpdatesBloc
DbFileDownloadsBloc

# Global
GlobalAudioBloc
InitBloc
BackupBloc
```

### 6. Use Cases

```
# Authentication
SignUpUseCase
GetCurrentUserUseCase

# Audio
PlayAyahAudioUseCase
GetAyahAudiosUseCase
GetAudioStateUseCase
DownloadAyahAudiosUseCase
CheckAyahAudioFilesUseCase

# Quran
GetJuzsUseCase
GetAyahInterpretationsUseCase
CopyAyahUseCase
CheckQuranFontFilesUseCase
DownloadQuranFontFilesUseCase
DeleteQuranFontFilesUseCase

# Search
SearchSurahsUseCase

# Khitmahs
AddKhitmahByDaysUseCase
AddKhitmahByUnitsUseCase
GetKhitmahQuotasUseCase
DeleteKhitmahUseCase
FinishKhitmahUseCase
CancelKhitmahNotificationsUseCase
CheckKhitmahNotificationStatusUseCase

# Daily Ayah
GetDailyAyahsUseCase
GenerateRandomDailyAyahsUseCase
ScheduleDailyAyahNotificationUseCase

# Favorites
AddToFavoriteAyahsUseCase
RemoveFromFavoriteAyahsUseCase
StreamFavoriteAyahsUseCase
AddToFavoriteLecturesUseCase
GetFavoriteLecturesUseCase

# Ayah Groups
AddAyahGroupsUseCase
AddToAyahGroupsUseCase
AddManyToAyahGroupsUseCase
DeleteAyahGroupsUseCase
GetAyahGroupsUseCase
GetAyahGroupSelectionsUseCase
StreamAyahGroupsUseCase

# Lectures
GetLectureDetailsUseCase
GetLectureParagraphsUseCase
GetLectureAudiosUseCase
GetAllowedLecturesUseCase
DeleteMediaUseCase
DownloadMediaUseCase

# Reading Programs
GetActiveUisCodesUseCase
CancelProgramNotificationsUseCase
FinishProgramUseCase

# Database
CheckDbVersionsUseCase
CheckDbFileDownloadsUseCase
DownloadDbFilesUseCase

# Backup
ExportBackupUseCase

# Stop Points
GetLastStopPointUseCase
GetLastReadLectureUseCase

# Notifications
GetLocalNotificationsByReferenceIdUseCase
DeleteLocalNotificationUseCase
```

### 7. Repositories

```
# Authentication
AuthRepository
AuthRepositoryImplement

# Quran Audio
QuranAudioPlayerRepository
QuranAudioPlayerRepositoryImplement

# Quran Display
QuranDisplayModeRepository
QuranDisplayModeRepositoryImplement

# Downloads
LectureDownloadsRepository
LectureDownloadsRepositoryImplement
QuranDownloadsRepository (inferred)

# Khitmahs
KhitmahsRepository
KhitmahsRepositoryImplement

# Favorites
FavoriteAyahsRepository
FavoriteAyahsRepositoryImplement
FavoriteLecturesRepository
FavoriteLecturesRepositoryImplement

# Ayah Groups
AyahGroupsRepository
AyahGroupsRepositoryImplement

# Lectures
LectureMediaRepository
LectureMediaRepositoryImplement
LectureParagraphsRepository
LectureParagraphsRepositoryImplement
LectureSearchRepository
LectureSearchRepositoryImplement
LectureStopPointsRepository
LectureStopPointsRepositoryImplement
QuranLecturesRepository
QuranLecturesRepositoryImplement

# Media
MediaAudioPlayerRepository
MediaAudioPlayerRepositoryImplement

# Daily Content
DailyAyahRepository
DailyAyahRepositoryImplement

# Database
DbUpdatesRepository
DbUpdatesRepositoryImplement

# Settings
NotificationRepository
NotificationRepositoryImplement

# Backup
BackupRepository
BackupRepositoryImplement

# Init
InitRepository
InitRepositoryImplement
```

### 8. Views/Screens

```
# Quran Main
QuranHomeView
HomeTabsView
QuranPageView
QuranAudioPlayerMaximizedView
QuranAudioPlayerMinimizedView

# Index
IndexTabsView
JuzsIndexView
SurahsIndexView (inferred)

# Search
QuranSearchView (inferred)
SearchSurahsView (inferred)

# Audio/Reciters
RecitersSelectionView
QuranDownloadsView
AyahAudiosDownloadingView
ConfirmAyahAudiosDownloadView
ConfirmAllAudiosDownloadView

# Settings
QuranSettingsView
QuranDisplayModeSettingView

# Khitmahs
KhitmahsTabsView
CurrentKhitmahsView
FinishedKhitmahsView
PausedKhitmahsView
CreateKhitmahView
KhitmahOptionsView
KhitmahDailyQuotasView

# Daily
DailyScheduleView
DailyScheduleTabsView

# Favorites
FavoriteAyahsView
FavoriteLecturesView

# Ayah Groups
AyahGroupsView
AyahGroupAyahsView
AyahGroupFormView
AyahGroupsSelectionView
AddToAyahGroupView

# Lectures
LectureView
LectureParagraphsView
MoveToLecturePageView
ParagraphShareView
TextLinkView

# Lecture Search
LectureSearchView
SearchLecturesView
SearchParagraphsView
SearchTabsView

# Lecture Media
LecturesMediaView
MediaListView
MediaAudiosListView
MediaVideosListView
MediaDocsListView
MediaImagesListView

# Downloads
ConfirmMediaDownloadView
ConfirmAllMediaDownloadView
MediaDownloadingView

# Media Player
MediaAudioPlayerView
LectureAudioPlayerMinimizedView

# Misc
ErrorView
AboutUsView (inferred)
```

### 9. Database Tables

```
# Quran Core
quran_ayah
quran_surah
quran_page
quran_juz
quran_hizb
quran_glyph
quran_glyphtype

# Audio
quran_reciter
quran_recitation
quran_recitertype
quran_reciteraudio
quran_ayahaudio

# Wiki/Lectures
quran_wiki_lecturer
quran_wiki_lecturertype
quran_wiki_lecturer_types
quran_wiki_lecture
quran_wiki_lecturegroup
quran_wiki_lecturegrouplecture
quran_wiki_lectureinfo
quran_wiki_lectureinfotype
quran_wiki_lectureui
quran_wiki_paragraph
quran_wiki_paragraphmedia
quran_wiki_media
quran_wiki_mediatype
quran_wiki_album
quran_wiki_tag
quran_wiki_tag_lectures
quran_wiki_textlink
quran_wiki_personalinfo
quran_wiki_personalinfotype
quran_wiki_personalmedia

# Reading Programs
reading_program_readingprogram
reading_program_readingday
reading_program_readingtask
reading_program_readingtasktype
reading_program_readingtaskunit

# Common
common_services_country
```

### 10. Notifications

```
# Handlers
DailyAyahNotificationHandler
KhitmahNotificationHandler
ProgramNotificationHandler
QuranNotificationsHandler

# Scheduling
[Notification] Scheduled with Notifications: id=
[Notification] Currently scheduled in Flutter Notifications:

# Methods
ScheduleDailyAyahNotificationUseCase
CancelKhitmahNotificationsUseCase
CancelProgramNotificationsUseCase
CheckKhitmahNotificationStatusUseCase
CheckProgramNotificationStatusUseCase

# Flutter Local Notifications
FlutterLocalNotificationsPlatform
ScheduledNotificationReceiver
ScheduledNotificationBootReceiver
FlutterLocalNotificationsReceiver

# Initialization
quranOnTapNotificationsHandler
```

### 11. Audio/Media

```
# Audio Service
AudioService
AudioServiceActivity
AudioServiceConfig
MediaButtonReceiver
AudioProcessingState
AudioButtonState
AudioDevice
AndroidAudioDeviceType
AndroidScoAudioEvent
AndroidScoAudioState
AudioSessionConfiguration

# States
playing
paused
stopped
buffering
completed

# Playback
playbackStateChanged
loadAyahAudios
getAudioState
playAyahAudio
pauseAudio
resumeAudio
stopAudio
nextAyah
previousAyah
```

### 12. Download Management

```
# Classes
DownloadedReceiver
DownloadManager
FlutterDownloader

# States
DbFileDownloadsState.success()
SurahAudioDownloadsState
LectureDownloadsState

# Use Cases
DownloadAyahAudiosUseCase
DownloadDbFilesUseCase
DownloadMediaUseCase
DownloadQuranFontFilesUseCase
CheckDbFileDownloadsUseCase

# Methods
getAbsoluteDownloadsDirectory
```

### 13. Quran-Specific Entities

```
# Entities
AyahEntity
AyahGroupEntity
AyahGroupAyahEntity
AyahGroupSelectionEntity
SurahEntity
GlyphEntity
BasmalahEntity
LectureMediaEntity
QuranPlayableEntity
QuranUnitEntity
DailyAyahEntity
FavoriteAyahEntity
FavoriteLectureEntity
StopPointEntity
ParagraphSearchHitEntity
TextLinkEntity

# Models
AyahModel
SurahModel
GlyphModel
LectureMediaModel
DailyAyahModel
DailyAyahResponseModel
AddFavoriteAyahModel
AddFavoriteLectureModel
FavoriteAyahModel
FavoriteLectureModel
AyahGroupModel
AyahGroupAyahModel
AyahGroupSelectionModel
CreateAyahGroupModel
UpdateAyahGroupModel
ParagraphMediaModel
SearchAyahModel
AyahsSearchResultModel
DbVersionModel
DbFileDownloadModel
DbPatchModel
CreateKhitmahByDaysModel
CreateKhitmahByUnitsModel
UpdateKhitmahModel
UpdateUserModel
LocalNotificationModel
```

### 14. Enums

```
# Khitmah
KhitmahDivisionUnit
KhitmahInputMode
KhitmahStatus

# Quran
QuranDisplayMode
QuranPlayerUnit
SurahFallPlace
```

### 15. Settings/Config

```
# Classes
ApiConfig
AppSettingsService
QuranSettingsService
QuranSettingsModel
UserSettingsModel

# Methods
setUserSettings
getUserSettings
checkAppVersion
checkStorageFreeSpace
```

---

## File Paths Structure

### Drift Database Paths

```
package:drift/src/runtime/api/batch.dart
package:drift/src/runtime/api/connection.dart
package:drift/src/runtime/api/connection_user.dart
package:drift/src/runtime/api/db_base.dart
package:drift/src/runtime/api/options.dart
package:drift/src/runtime/api/runtime_api.dart
package:drift/src/runtime/api/stream_updates.dart
package:drift/src/runtime/query_builder/expressions/text.dart
package:drift/src/runtime/query_builder/schema/table_info.dart
```

### SQLite Paths

```
package:sqlite3/src/ffi/api.dart
package:sqlite3/src/functions.dart
package:sqlite3/src/implementation/utils.dart
/lib/libsqlite3.so
.sqlite
```

---

## Embedded Paths

Development path found in binary:
```
file:///C:/Users/yahiaalabyadh/dev/flutter/hqp_mobile_app/.dart_tool/flutter_build/dart_plugin_registrant.dart
```

This indicates the development was done on Windows with the developer username "yahiaalabyadh".

---

## External Dependencies

### Icons
- **cupertino_icons**: iOS-style icons
- **font_awesome_flutter**: Font Awesome 7 icons
- **hugeicons**: Stroke-rounded icon set

### UI Libraries
- **flutter_widget_from_html_core**: HTML rendering
- **extended_image**: Advanced image handling
- **scrollable_positioned_list**: List scrolling
- **fading_edge_scrollview**: Edge fading effects
- **glass**: Glass morphism effects
- **wakelock_plus**: Screen wake lock

### Functional
- **clock**: Time utilities
- **crypto**: Cryptographic functions
- **intl**: Internationalization
- **path_parsing**: SVG path parsing
- **vector_graphics_compiler**: Vector graphics
- **vector_math**: Vector math operations
- **xml**: XML parsing

---

## Key Insights

### 1. Architecture Pattern
- Clean Architecture with strict layer separation
- Feature-first organization under `src/apps/quran/features/`
- Shared core utilities in `src/core/`

### 2. State Management
- BLoC pattern with freezed for immutable states
- Event-driven architecture with reactive streams
- Dependency injection using GetIt

### 3. Data Strategy
- Offline-first with SQLite (Drift ORM)
- Remote sync with version checking
- Local caching for media and audio

### 4. Audio Architecture
- Gapless playback with timing data
- Background service integration
- Media session support for lock screen controls

### 5. Content Model
- Structured lectures with paragraphs and media
- Cross-reference linking system
- Tag-based categorization
- Multi-type media attachments

---

## Confidence Assessment

| Category | Confidence | Notes |
|----------|------------|-------|
| Package structure | 100% | Directly extracted from strings |
| BLoC names | 100% | Directly extracted from strings |
| Use case names | 95% | Mostly complete from strings |
| Repository names | 95% | Mostly complete from strings |
| View names | 90% | Inferred from view.dart patterns |
| Feature list | 100% | Complete from package analysis |
| Database tables | 100% | Confirmed from schema dump |
| API endpoint | 100% | Base URL confirmed in strings |
| Entity/Model names | 90% | Extracted from class patterns |
