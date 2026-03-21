import 'package:equatable/equatable.dart';

/// كيان القارئ
class ReciterEntity extends Equatable {
  final int id;
  final String? name;
  final bool isComplete;
  final int? approvalStatus;
  final int? countryId;
  final String? profile;
  final DateTime? createdAt;
  final DateTime? updatedAt;

  const ReciterEntity({
    required this.id,
    this.name,
    this.isComplete = false,
    this.approvalStatus,
    this.countryId,
    this.profile,
    this.createdAt,
    this.updatedAt,
  });

  @override
  List<Object?> get props => [id, name, isComplete, approvalStatus, countryId, profile];
}

/// كيان التلاوة/الرواية
class RecitationEntity extends Equatable {
  final int id;
  final String name;
  final bool isActive;
  final DateTime? createdAt;

  const RecitationEntity({
    required this.id,
    required this.name,
    this.isActive = false,
    this.createdAt,
  });

  @override
  List<Object?> get props => [id, name, isActive];
}

/// كيان نوع القارئ (ربط القارئ بالتلاوة)
class ReciterTypeEntity extends Equatable {
  final int id;
  final int? reciterId;
  final int? recitationId;
  final int? approvalStatus;

  const ReciterTypeEntity({
    required this.id,
    this.reciterId,
    this.recitationId,
    this.approvalStatus,
  });

  @override
  List<Object?> get props => [id, reciterId, recitationId, approvalStatus];
}

/// كيان ملف صوتي للسورة
class ReciterAudioEntity extends Equatable {
  final int id;
  final int? reciterId;
  final int? surahId;
  final int? reciterTypeId;
  final String audio;
  final int? approvalStatus;
  final bool isComplete;

  const ReciterAudioEntity({
    required this.id,
    this.reciterId,
    this.surahId,
    this.reciterTypeId,
    required this.audio,
    this.approvalStatus,
    this.isComplete = false,
  });

  @override
  List<Object?> get props => [id, reciterId, surahId, reciterTypeId, audio, isComplete];
}

/// كيان صوت الآية (للتشغيل المتواصل)
class AyahAudioEntity extends Equatable {
  final int id;
  final int? reciterAudioId;
  final int? reciterId;
  final int? surahId;
  final int? ayahId;
  final int? ayahOrder;
  final int? reciterTypeId;
  final String audio;
  final int? startTime; // بالمللي ثانية
  final int? endTime; // بالمللي ثانية

  const AyahAudioEntity({
    required this.id,
    this.reciterAudioId,
    this.reciterId,
    this.surahId,
    this.ayahId,
    this.ayahOrder,
    this.reciterTypeId,
    required this.audio,
    this.startTime,
    this.endTime,
  });

  Duration? get startDuration =>
      startTime != null ? Duration(milliseconds: startTime!) : null;
  Duration? get endDuration =>
      endTime != null ? Duration(milliseconds: endTime!) : null;

  @override
  List<Object?> get props => [
        id,
        reciterAudioId,
        reciterId,
        surahId,
        ayahId,
        ayahOrder,
        reciterTypeId,
        audio,
        startTime,
        endTime,
      ];
}
