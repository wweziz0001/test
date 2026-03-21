import { NextResponse } from 'next/server';
import { db } from '@/lib/db';

export async function GET() {
  try {
    const lecturers = await db.lecturer.findMany({
      where: {
        deletedAt: null
      },
      orderBy: { name: 'asc' }
    });
    
    return NextResponse.json({
      success: true,
      data: lecturers,
      total: lecturers.length
    });
  } catch (error) {
    console.error('Error fetching lecturers:', error);
    return NextResponse.json(
      { success: false, error: 'Failed to fetch lecturers' },
      { status: 500 }
    );
  }
}
