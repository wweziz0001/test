import { NextResponse } from 'next/server';
import { db } from '@/lib/db';

export async function GET() {
  try {
    const surahs = await db.surah.findMany({
      orderBy: { moshafOrder: 'asc' }
    });
    
    return NextResponse.json({
      success: true,
      data: surahs,
      total: surahs.length
    });
  } catch (error) {
    console.error('Error fetching surahs:', error);
    return NextResponse.json(
      { success: false, error: 'Failed to fetch surahs' },
      { status: 500 }
    );
  }
}
