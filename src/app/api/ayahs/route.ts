import { NextRequest, NextResponse } from 'next/server';
import { db } from '@/lib/db';

export async function GET(request: NextRequest) {
  try {
    const searchParams = request.nextUrl.searchParams;
    const surahId = searchParams.get('surah_id');
    const pageId = searchParams.get('page_id');
    const juzId = searchParams.get('juz_id');
    const search = searchParams.get('q');
    
    let where: any = {};
    
    if (surahId) {
      where.surahId = parseInt(surahId);
    }
    if (pageId) {
      where.pageId = parseInt(pageId);
    }
    if (juzId) {
      where.juzId = parseInt(juzId);
    }
    if (search) {
      where.OR = [
        { plainText: { contains: search } },
        { quranText: { contains: search } }
      ];
    }
    
    const ayahs = await db.ayah.findMany({
      where,
      orderBy: { ayahOrder: 'asc' },
      take: 100
    });
    
    return NextResponse.json({
      success: true,
      data: ayahs,
      total: ayahs.length
    });
  } catch (error) {
    console.error('Error fetching ayahs:', error);
    return NextResponse.json(
      { success: false, error: 'Failed to fetch ayahs' },
      { status: 500 }
    );
  }
}
