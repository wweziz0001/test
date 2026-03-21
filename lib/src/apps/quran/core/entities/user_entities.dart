import 'package:equatable/equatable.dart';

/// كيان الختمة
class KhitmahEntity extends Equatable {
  final int id;
  final String? name;
  final int? divisionUnit; // 0=صفحات, 1=أجزاء, 2=سور
  final int? status; // 0=نشط, 1=متوقف, 2=مكتمل
  final DateTime? startDate;
  final DateTime? endDate;
  final int? reminderTime; // بالدقائق من منتصف الليل
  final String? cover;

  const KhitmahEntity({
    required this.id,
    this.name,
    this.divisionUnit,
    this.status,
    this.startDate,
    this.endDate,
    this.reminderTime,
    this.cover,
  });

  bool get isActive => status == 0;
  bool get isPaused => status == 1;
  bool get isCompleted => status == 2;

  String get divisionUnitName {
    switch (divisionUnit) {
      case 0:
        return 'صفحات';
      case 1:
        return 'أجزاء';
      case 2:
        return 'سور';
      default:
        return '';
    }
  }

  @override
  List<Object?> get props => [
        id,
        name,
        divisionUnit,
        status,
        startDate,
        endDate,
        reminderTime,
        cover,
      ];
}

/// كيان الحصة اليومية
class DailyQuotaEntity extends Equatable {
  final int id;
  final int? khitmahId;
  final DateTime? date;
  final int? fromRecordId;
  final int? toRecordId;
  final bool isCompleted;

  const DailyQuotaEntity({
    required this.id,
    this.khitmahId,
    this.date,
    this.fromRecordId,
    this.toRecordId,
    this.isCompleted = false,
  });

  @override
  List<Object?> get props => [id, khitmahId, date, fromRecordId, toRecordId, isCompleted];
}

/// كيان الآية المفضلة
class FavoriteAyahEntity extends Equatable {
  final int id;
  final int? ayahId;
  final int? surahId;
  final DateTime? createdAt;

  const FavoriteAyahEntity({
    required this.id,
    this.ayahId,
    this.surahId,
    this.createdAt,
  });

  @override
  List<Object?> get props => [id, ayahId, surahId, createdAt];
}

/// كيان المحاضرة المفضلة
class FavoriteLectureEntity extends Equatable {
  final int id;
  final int? lectureId;
  final DateTime? createdAt;

  const FavoriteLectureEntity({
    required this.id,
    this.lectureId,
    this.createdAt,
  });

  @override
  List<Object?> get props => [id, lectureId, createdAt];
}

/// كيان مجموعة الآيات
class AyahGroupEntity extends Equatable {
  final int id;
  final String? name;
  final String? description;
  final DateTime? createdAt;
  final DateTime? updatedAt;

  const AyahGroupEntity({
    required this.id,
    this.name,
    this.description,
    this.createdAt,
    this.updatedAt,
  });

  @override
  List<Object?> get props => [id, name, description, createdAt, updatedAt];
}

/// كيان نقطة التوقف
class StopPointEntity extends Equatable {
  final int id;
  final int? pageId;
  final int? ayahId;
  final DateTime? createdAt;
  final DateTime? updatedAt;

  const StopPointEntity({
    required this.id,
    this.pageId,
    this.ayahId,
    this.createdAt,
    this.updatedAt,
  });

  @override
  List<Object?> get props => [id, pageId, ayahId, createdAt, updatedAt];
}

/// كيان برنامج القراءة
class ReadingProgramEntity extends Equatable {
  final int id;
  final String? name;
  final String? cover;
  final int? reminderTime;
  final DateTime? startDate;
  final DateTime? publishDate;
  final int? approvalStatus;
  final bool isComplete;

  const ReadingProgramEntity({
    required this.id,
    this.name,
    this.cover,
    this.reminderTime,
    this.startDate,
    this.publishDate,
    this.approvalStatus,
    this.isComplete = false,
  });

  @override
  List<Object?> get props => [
        id,
        name,
        cover,
        reminderTime,
        startDate,
        publishDate,
        approvalStatus,
        isComplete,
      ];
}
