import { NextResponse } from 'next/server';
import { db } from '@/lib/db';

export async function GET() {
  try {
    const reciters = await db.reciter.findMany({
      where: {
        deletedAt: null
      },
      orderBy: { name: 'asc' }
    });
    
    return NextResponse.json({
      success: true,
      data: reciters,
      total: reciters.length
    });
  } catch (error) {
    console.error('Error fetching reciters:', error);
    return NextResponse.json(
      { success: false, error: 'Failed to fetch reciters' },
      { status: 500 }
    );
  }
}
