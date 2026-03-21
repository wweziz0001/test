.class public final Landroidx/fragment/app/A;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/LayoutInflater$Factory2;


# instance fields
.field public final l:Landroidx/fragment/app/L;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/L;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/fragment/app/A;->l:Landroidx/fragment/app/L;

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
.method public final onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 10

    .line 2
    const-class v0, Landroidx/fragment/app/y;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    iget-object v1, p0, Landroidx/fragment/app/A;->l:Landroidx/fragment/app/L;

    if-eqz v0, :cond_0

    .line 3
    new-instance p1, Landroidx/fragment/app/y;

    invoke-direct {p1, p3, p4, v1}, Landroidx/fragment/app/y;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;Landroidx/fragment/app/L;)V

    return-object p1

    .line 4
    :cond_0
    const-string v0, "fragment"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    const/4 v0, 0x0

    if-nez p2, :cond_1

    return-object v0

    .line 5
    :cond_1
    const-string p2, "class"

    invoke-interface {p4, v0, p2}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 6
    sget-object v2, LU/a;->a:[I

    invoke-virtual {p3, p4, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v2

    const/4 v3, 0x0

    if-nez p2, :cond_2

    .line 7
    invoke-virtual {v2, v3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    :cond_2
    const/4 v4, 0x1

    const/4 v5, -0x1

    .line 8
    invoke-virtual {v2, v4, v5}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v6

    const/4 v7, 0x2

    .line 9
    invoke-virtual {v2, v7}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 10
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    if-eqz p2, :cond_15

    .line 11
    invoke-virtual {p3}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    .line 12
    :try_start_0
    invoke-static {v2, p2}, Landroidx/fragment/app/F;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    .line 13
    const-class v9, Landroidx/fragment/app/r;

    invoke-virtual {v9, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v2
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move v2, v3

    :goto_0
    if-nez v2, :cond_3

    goto/16 :goto_7

    :cond_3
    if-eqz p1, :cond_4

    .line 14
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v3

    :cond_4
    if-ne v3, v5, :cond_6

    if-ne v6, v5, :cond_6

    if-eqz v8, :cond_5

    goto :goto_1

    .line 15
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p4}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, ": Must specify unique android:id, android:tag, or have a parent with an id for "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    :goto_1
    if-eq v6, v5, :cond_7

    .line 16
    invoke-virtual {v1, v6}, Landroidx/fragment/app/L;->B(I)Landroidx/fragment/app/r;

    move-result-object v2

    goto :goto_2

    :cond_7
    move-object v2, v0

    :goto_2
    if-nez v2, :cond_8

    if-eqz v8, :cond_8

    .line 17
    invoke-virtual {v1, v8}, Landroidx/fragment/app/L;->C(Ljava/lang/String;)Landroidx/fragment/app/r;

    move-result-object v2

    :cond_8
    if-nez v2, :cond_9

    if-eq v3, v5, :cond_9

    .line 18
    invoke-virtual {v1, v3}, Landroidx/fragment/app/L;->B(I)Landroidx/fragment/app/r;

    move-result-object v2

    .line 19
    :cond_9
    const-string v5, "Fragment "

    const-string v9, "FragmentManager"

    if-nez v2, :cond_d

    .line 20
    invoke-virtual {v1}, Landroidx/fragment/app/L;->G()Landroidx/fragment/app/F;

    move-result-object p4

    .line 21
    invoke-virtual {p3}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 22
    invoke-virtual {p4, p2}, Landroidx/fragment/app/F;->a(Ljava/lang/String;)Landroidx/fragment/app/r;

    move-result-object v2

    .line 23
    iput-boolean v4, v2, Landroidx/fragment/app/r;->y:Z

    if-eqz v6, :cond_a

    move p3, v6

    goto :goto_3

    :cond_a
    move p3, v3

    .line 24
    :goto_3
    iput p3, v2, Landroidx/fragment/app/r;->H:I

    .line 25
    iput v3, v2, Landroidx/fragment/app/r;->I:I

    .line 26
    iput-object v8, v2, Landroidx/fragment/app/r;->J:Ljava/lang/String;

    .line 27
    iput-boolean v4, v2, Landroidx/fragment/app/r;->z:Z

    .line 28
    iput-object v1, v2, Landroidx/fragment/app/r;->D:Landroidx/fragment/app/L;

    .line 29
    iget-object p3, v1, Landroidx/fragment/app/L;->v:Landroidx/fragment/app/v;

    .line 30
    iput-object p3, v2, Landroidx/fragment/app/r;->E:Landroidx/fragment/app/v;

    .line 31
    iget-object p4, p3, Landroidx/fragment/app/v;->r:Landroidx/fragment/app/w;

    .line 32
    iput-boolean v4, v2, Landroidx/fragment/app/r;->O:Z

    if-nez p3, :cond_b

    goto :goto_4

    .line 33
    :cond_b
    iget-object v0, p3, Landroidx/fragment/app/v;->q:Landroidx/fragment/app/w;

    :goto_4
    if-eqz v0, :cond_c

    .line 34
    iput-boolean v4, v2, Landroidx/fragment/app/r;->O:Z

    .line 35
    :cond_c
    invoke-virtual {v1, v2}, Landroidx/fragment/app/L;->a(Landroidx/fragment/app/r;)Landroidx/fragment/app/T;

    move-result-object p3

    .line 36
    invoke-static {v9, v7}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p4

    if-eqz p4, :cond_10

    .line 37
    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " has been inflated via the <fragment> tag: id=0x"

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    invoke-static {v6}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    .line 39
    invoke-static {v9, p4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_6

    .line 40
    :cond_d
    iget-boolean p3, v2, Landroidx/fragment/app/r;->z:Z

    if-nez p3, :cond_14

    .line 41
    iput-boolean v4, v2, Landroidx/fragment/app/r;->z:Z

    .line 42
    iput-object v1, v2, Landroidx/fragment/app/r;->D:Landroidx/fragment/app/L;

    .line 43
    iget-object p3, v1, Landroidx/fragment/app/L;->v:Landroidx/fragment/app/v;

    .line 44
    iput-object p3, v2, Landroidx/fragment/app/r;->E:Landroidx/fragment/app/v;

    .line 45
    iget-object p4, p3, Landroidx/fragment/app/v;->r:Landroidx/fragment/app/w;

    .line 46
    iput-boolean v4, v2, Landroidx/fragment/app/r;->O:Z

    if-nez p3, :cond_e

    goto :goto_5

    .line 47
    :cond_e
    iget-object v0, p3, Landroidx/fragment/app/v;->q:Landroidx/fragment/app/w;

    :goto_5
    if-eqz v0, :cond_f

    .line 48
    iput-boolean v4, v2, Landroidx/fragment/app/r;->O:Z

    .line 49
    :cond_f
    invoke-virtual {v1, v2}, Landroidx/fragment/app/L;->g(Landroidx/fragment/app/r;)Landroidx/fragment/app/T;

    move-result-object p3

    .line 50
    invoke-static {v9, v7}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p4

    if-eqz p4, :cond_10

    .line 51
    new-instance p4, Ljava/lang/StringBuilder;

    const-string v0, "Retained Fragment "

    invoke-direct {p4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " has been re-attached via the <fragment> tag: id=0x"

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    invoke-static {v6}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    .line 53
    invoke-static {v9, p4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 54
    :cond_10
    :goto_6
    check-cast p1, Landroid/view/ViewGroup;

    sget-object p4, LV/d;->a:LV/c;

    .line 55
    new-instance p4, LV/a;

    .line 56
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Attempting to use <fragment> tag to add fragment "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " to container "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 57
    invoke-direct {p4, v2, v0}, LV/a;-><init>(Landroidx/fragment/app/r;Ljava/lang/String;)V

    .line 58
    invoke-static {p4}, LV/d;->b(LV/a;)V

    .line 59
    invoke-static {v2}, LV/d;->a(Landroidx/fragment/app/r;)LV/c;

    move-result-object p4

    .line 60
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    iput-object p1, v2, Landroidx/fragment/app/r;->P:Landroid/view/ViewGroup;

    .line 62
    invoke-virtual {p3}, Landroidx/fragment/app/T;->k()V

    .line 63
    invoke-virtual {p3}, Landroidx/fragment/app/T;->j()V

    .line 64
    iget-object p1, v2, Landroidx/fragment/app/r;->Q:Lio/flutter/embedding/android/D;

    if-eqz p1, :cond_13

    if-eqz v6, :cond_11

    .line 65
    invoke-virtual {p1, v6}, Landroid/view/View;->setId(I)V

    .line 66
    :cond_11
    iget-object p1, v2, Landroidx/fragment/app/r;->Q:Lio/flutter/embedding/android/D;

    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_12

    .line 67
    iget-object p1, v2, Landroidx/fragment/app/r;->Q:Lio/flutter/embedding/android/D;

    invoke-virtual {p1, v8}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 68
    :cond_12
    iget-object p1, v2, Landroidx/fragment/app/r;->Q:Lio/flutter/embedding/android/D;

    new-instance p2, LN1/i;

    invoke-direct {p2, p0, p3}, LN1/i;-><init>(Landroidx/fragment/app/A;Landroidx/fragment/app/T;)V

    invoke-virtual {p1, p2}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 69
    iget-object p1, v2, Landroidx/fragment/app/r;->Q:Lio/flutter/embedding/android/D;

    return-object p1

    .line 70
    :cond_13
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p3, " did not create a view."

    .line 71
    invoke-static {v5, p2, p3}, Lb3/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 72
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 73
    :cond_14
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p4}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, ": Duplicate id 0x"

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    invoke-static {v6}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, ", tag "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, ", or parent id 0x"

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, " with another fragment for "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_15
    :goto_7
    return-object v0
.end method

.method public final onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0, p1, p2, p3}, Landroidx/fragment/app/A;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method
