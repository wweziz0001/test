.class public final Lm/t0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# instance fields
.field public final synthetic a:Landroidx/appcompat/widget/SearchView;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/SearchView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lm/t0;->a:Landroidx/appcompat/widget/SearchView;

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method


# virtual methods
.method public final onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 0

    .line 1
    iget-object p1, p0, Lm/t0;->a:Landroidx/appcompat/widget/SearchView;

    .line 2
    .line 3
    iget-object p2, p1, Landroidx/appcompat/widget/SearchView;->I:Landroid/view/View;

    .line 4
    .line 5
    invoke-virtual {p2}, Landroid/view/View;->getWidth()I

    .line 6
    .line 7
    .line 8
    move-result p3

    .line 9
    const/4 p4, 0x1

    .line 10
    if-le p3, p4, :cond_2

    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 13
    .line 14
    .line 15
    move-result-object p3

    .line 16
    invoke-virtual {p3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 17
    .line 18
    .line 19
    move-result-object p3

    .line 20
    iget-object p4, p1, Landroidx/appcompat/widget/SearchView;->C:Landroid/view/View;

    .line 21
    .line 22
    invoke-virtual {p4}, Landroid/view/View;->getPaddingLeft()I

    .line 23
    .line 24
    .line 25
    move-result p4

    .line 26
    new-instance p5, Landroid/graphics/Rect;

    .line 27
    .line 28
    invoke-direct {p5}, Landroid/graphics/Rect;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-static {p1}, Lm/Z0;->a(Landroid/view/View;)Z

    .line 32
    .line 33
    .line 34
    move-result p6

    .line 35
    iget-boolean p7, p1, Landroidx/appcompat/widget/SearchView;->a0:Z

    .line 36
    .line 37
    if-eqz p7, :cond_0

    .line 38
    .line 39
    const p7, 0x7f060029

    .line 40
    .line 41
    .line 42
    invoke-virtual {p3, p7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 43
    .line 44
    .line 45
    move-result p7

    .line 46
    const p8, 0x7f06002a

    .line 47
    .line 48
    .line 49
    invoke-virtual {p3, p8}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 50
    .line 51
    .line 52
    move-result p3

    .line 53
    add-int/2addr p3, p7

    .line 54
    goto :goto_0

    .line 55
    :cond_0
    const/4 p3, 0x0

    .line 56
    :goto_0
    iget-object p1, p1, Landroidx/appcompat/widget/SearchView;->A:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    .line 57
    .line 58
    invoke-virtual {p1}, Landroid/widget/AutoCompleteTextView;->getDropDownBackground()Landroid/graphics/drawable/Drawable;

    .line 59
    .line 60
    .line 61
    move-result-object p7

    .line 62
    invoke-virtual {p7, p5}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 63
    .line 64
    .line 65
    if-eqz p6, :cond_1

    .line 66
    .line 67
    iget p6, p5, Landroid/graphics/Rect;->left:I

    .line 68
    .line 69
    neg-int p6, p6

    .line 70
    goto :goto_1

    .line 71
    :cond_1
    iget p6, p5, Landroid/graphics/Rect;->left:I

    .line 72
    .line 73
    add-int/2addr p6, p3

    .line 74
    sub-int p6, p4, p6

    .line 75
    .line 76
    :goto_1
    invoke-virtual {p1, p6}, Landroid/widget/AutoCompleteTextView;->setDropDownHorizontalOffset(I)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p2}, Landroid/view/View;->getWidth()I

    .line 80
    .line 81
    .line 82
    move-result p2

    .line 83
    iget p6, p5, Landroid/graphics/Rect;->left:I

    .line 84
    .line 85
    add-int/2addr p2, p6

    .line 86
    iget p5, p5, Landroid/graphics/Rect;->right:I

    .line 87
    .line 88
    add-int/2addr p2, p5

    .line 89
    add-int/2addr p2, p3

    .line 90
    sub-int/2addr p2, p4

    .line 91
    invoke-virtual {p1, p2}, Landroid/widget/AutoCompleteTextView;->setDropDownWidth(I)V

    .line 92
    .line 93
    .line 94
    :cond_2
    return-void
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
.end method
