import { NextRequest, NextResponse } from 'next/server';
import { db } from '@/lib/db';

export async function GET(request: NextRequest) {
  try {
    const searchParams = request.nextUrl.searchParams;
    const lecturerId = searchParams.get('lecturer_id');
    const search = searchParams.get('q');
    const page = parseInt(searchParams.get('page') || '1');
    const limit = parseInt(searchParams.get('limit') || '20');
    
    let where: any = {
      deletedAt: null
    };
    
    if (lecturerId) {
      where.lecturerId = parseInt(lecturerId);
    }
    if (search) {
      where.OR = [
        { title: { contains: search } },
        { keywords: { contains: search } },
        { shortContent: { contains: search } }
      ];
    }
    
    const [lectures, total] = await Promise.all([
      db.lecture.findMany({
        where,
        orderBy: { ordr: 'desc' },
        skip: (page - 1) * limit,
        take: limit
      }),
      db.lecture.count({ where })
    ]);
    
    return NextResponse.json({
      success: true,
      data: lectures,
      pagination: {
        page,
        limit,
        total,
        totalPages: Math.ceil(total / limit)
      }
    });
  } catch (error) {
    console.error('Error fetching lectures:', error);
    return NextResponse.json(
      { success: false, error: 'Failed to fetch lectures' },
      { status: 500 }
    );
  }
}
