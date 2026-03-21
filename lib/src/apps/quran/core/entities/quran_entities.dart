import 'package:equatable/equatable.dart';

/// كيان السورة القرآنية
class SurahEntity extends Equatable {
  final int id;
  final int? juzId;
  final int? pageId;
  final int? fallOrder;
  final int? moshafOrder;
  final int? ayahsCount;
  final int? fallPlace; // 0=مكية, 1=مدنية
  final String title;
  final String? names;
  final String? info;
  final String symbol;
  final int? startAyahOrder;

  const SurahEntity({
    required this.id,
    this.juzId,
    this.pageId,
    this.fallOrder,
    this.moshafOrder,
    this.ayahsCount,
    this.fallPlace,
    required this.title,
    this.names,
    this.info,
    required this.symbol,
    this.startAyahOrder,
  });

  bool get isMakki => fallPlace == 0;
  bool get isMadani => fallPlace == 1;

  @override
  List<Object?> get props => [
        id,
        juzId,
        pageId,
        fallOrder,
        moshafOrder,
        ayahsCount,
        fallPlace,
        title,
        names,
        info,
        symbol,
        startAyahOrder,
      ];
}

/// كيان الآية القرآنية
class AyahEntity extends Equatable {
  final int id;
  final int? surahId;
  final int? juzId;
  final int? hizbId;
  final int? pageId;
  final int? hizbNumber;
  final int? ayahOrder;
  final int? ayahNumber;
  final bool isStartHizb;
  final bool isStartJuz;
  final bool hasProstration;
  final int? prostrationType;
  final String? plainText;
  final String? quranText;
  final String? stem;

  const AyahEntity({
    required this.id,
    this.surahId,
    this.juzId,
    this.hizbId,
    this.pageId,
    this.hizbNumber,
    this.ayahOrder,
    this.ayahNumber,
    this.isStartHizb = false,
    this.isStartJuz = false,
    this.hasProstration = false,
    this.prostrationType,
    this.plainText,
    this.quranText,
    this.stem,
  });

  @override
  List<Object?> get props => [
        id,
        surahId,
        juzId,
        hizbId,
        pageId,
        hizbNumber,
        ayahOrder,
        ayahNumber,
        isStartHizb,
        isStartJuz,
        hasProstration,
        prostrationType,
        plainText,
        quranText,
        stem,
      ];
}

/// كيان صفحة المصحف
class PageEntity extends Equatable {
  final int id;
  final int? startSurahId;
  final int? startJuzId;
  final int? startHizbId;
  final int? hizbNumber;
  final int? pageNumber;
  final int? startAyahNumber;
  final int? startAyahOrder;

  const PageEntity({
    required this.id,
    this.startSurahId,
    this.startJuzId,
    this.startHizbId,
    this.hizbNumber,
    this.pageNumber,
    this.startAyahNumber,
    this.startAyahOrder,
  });

  @override
  List<Object?> get props => [
        id,
        startSurahId,
        startJuzId,
        startHizbId,
        hizbNumber,
        pageNumber,
        startAyahNumber,
        startAyahOrder,
      ];
}

/// كيان الجزء
class JuzEntity extends Equatable {
  final int id;
  final int? startSurahId;
  final int? startPageId;
  final int? juzNumber;
  final int? startAyahNumber;
  final String? firstAyahs;
  final int? startAyahOrder;

  const JuzEntity({
    required this.id,
    this.startSurahId,
    this.startPageId,
    this.juzNumber,
    this.startAyahNumber,
    this.firstAyahs,
    this.startAyahOrder,
  });

  @override
  List<Object?> get props => [
        id,
        startSurahId,
        startPageId,
        juzNumber,
        startAyahNumber,
        firstAyahs,
        startAyahOrder,
      ];
}

/// كيان الحزب
class HizbEntity extends Equatable {
  final int id;
  final int? juzId;
  final int? surahId;
  final int? startPageId;
  final int? hizbNumber;
  final int? segmentOrder;
  final int? ayahNumber;
  final String? firstAyahs;
  final int? startAyahOrder;
  final int? approvalStatus;

  const HizbEntity({
    required this.id,
    this.juzId,
    this.surahId,
    this.startPageId,
    this.hizbNumber,
    this.segmentOrder,
    this.ayahNumber,
    this.firstAyahs,
    this.startAyahOrder,
    this.approvalStatus,
  });

  String get segmentName {
    switch (segmentOrder) {
      case 1:
        return 'الربع الأول';
      case 2:
        return 'النصف';
      case 3:
        return 'الثلث';
      case 4:
        return 'الربع الأخير';
      default:
        return '';
    }
  }

  @override
  List<Object?> get props => [
        id,
        juzId,
        surahId,
        startPageId,
        hizbNumber,
        segmentOrder,
        ayahNumber,
        firstAyahs,
        startAyahOrder,
        approvalStatus,
      ];
}
