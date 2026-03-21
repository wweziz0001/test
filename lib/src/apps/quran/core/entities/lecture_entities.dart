import 'package:equatable/equatable.dart';

/// كيان المحاضر
class LecturerEntity extends Equatable {
  final int id;
  final String? name;
  final String? fullName;
  final String? profile;
  final String? code;
  final int? approvalStatus;
  final bool isComplete;

  const LecturerEntity({
    required this.id,
    this.name,
    this.fullName,
    this.profile,
    this.code,
    this.approvalStatus,
    this.isComplete = false,
  });

  @override
  List<Object?> get props => [id, name, fullName, profile, code, approvalStatus, isComplete];
}

/// كيان المحاضرة
class LectureEntity extends Equatable {
  final int id;
  final String? title;
  final String? keywords;
  final String? shortContent;
  final DateTime? date;
  final int? order;
  final String? cover;
  final int? views;
  final int? approvalStatus;
  final bool isComplete;
  final int? lecturerId;
  final int? albumId;

  const LectureEntity({
    required this.id,
    this.title,
    this.keywords,
    this.shortContent,
    this.date,
    this.order,
    this.cover,
    this.views,
    this.approvalStatus,
    this.isComplete = false,
    this.lecturerId,
    this.albumId,
  });

  @override
  List<Object?> get props => [
        id,
        title,
        keywords,
        shortContent,
        date,
        order,
        cover,
        views,
        approvalStatus,
        isComplete,
        lecturerId,
        albumId,
      ];
}

/// كيان الفقرة
class ParagraphEntity extends Equatable {
  final int id;
  final int? lectureId;
  final String? title;
  final int? order;
  final String? formattedContent;
  final String? content;
  final String? plainContent;
  final int? startPageNumber;
  final int? approvalStatus;

  const ParagraphEntity({
    required this.id,
    this.lectureId,
    this.title,
    this.order,
    this.formattedContent,
    this.content,
    this.plainContent,
    this.startPageNumber,
    this.approvalStatus,
  });

  @override
  List<Object?> get props => [
        id,
        lectureId,
        title,
        order,
        formattedContent,
        content,
        plainContent,
        startPageNumber,
        approvalStatus,
      ];
}

/// كيان الوسائط
class MediaEntity extends Equatable {
  final int id;
  final String? name;
  final String? media;
  final int? approvalStatus;
  final int? albumId;
  final int? lectureId;
  final int? mediaTypeId;

  const MediaEntity({
    required this.id,
    this.name,
    this.media,
    this.approvalStatus,
    this.albumId,
    this.lectureId,
    this.mediaTypeId,
  });

  @override
  List<Object?> get props => [id, name, media, approvalStatus, albumId, lectureId, mediaTypeId];
}

/// كيان الألبوم
class AlbumEntity extends Equatable {
  final int id;
  final String? name;
  final int? order;
  final String? cover;
  final bool isActive;
  final int? lecturerId;
  final int? lecturerTypeId;
  final int? albumId;

  const AlbumEntity({
    required this.id,
    this.name,
    this.order,
    this.cover,
    this.isActive = false,
    this.lecturerId,
    this.lecturerTypeId,
    this.albumId,
  });

  @override
  List<Object?> get props => [
        id,
        name,
        order,
        cover,
        isActive,
        lecturerId,
        lecturerTypeId,
        albumId,
      ];
}

/// كيان نوع المحاضر
class LecturerTypeEntity extends Equatable {
  final int id;
  final String? displayName;
  final String? code;

  const LecturerTypeEntity({
    required this.id,
    this.displayName,
    this.code,
  });

  @override
  List<Object?> get props => [id, displayName, code];
}
