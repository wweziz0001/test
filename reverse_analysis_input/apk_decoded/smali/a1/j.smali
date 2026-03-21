.class public final La1/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll1/A;


# instance fields
.field public final l:I

.field public final m:Ljava/lang/Object;

.field public final n:Ljava/lang/Object;

.field public final o:Ljava/lang/Object;

.field public final p:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LF0/C;LB0/d;[B[LF0/N;I)V
    .locals 0

    .line 170
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 171
    iput-object p1, p0, La1/j;->m:Ljava/lang/Object;

    .line 172
    iput-object p2, p0, La1/j;->n:Ljava/lang/Object;

    .line 173
    iput-object p3, p0, La1/j;->o:Ljava/lang/Object;

    .line 174
    iput-object p4, p0, La1/j;->p:Ljava/lang/Object;

    .line 175
    iput p5, p0, La1/j;->l:I

    return-void
.end method

.method public constructor <init>(Ll1/C;I)V
    .locals 2

    .line 176
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La1/j;->p:Ljava/lang/Object;

    .line 177
    new-instance p1, LF0/M;

    const/4 v0, 0x5

    new-array v1, v0, [B

    .line 178
    invoke-direct {p1, v0, v1}, LF0/M;-><init>(I[B)V

    .line 179
    iput-object p1, p0, La1/j;->m:Ljava/lang/Object;

    .line 180
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, La1/j;->n:Ljava/lang/Object;

    .line 181
    new-instance p1, Landroid/util/SparseIntArray;

    invoke-direct {p1}, Landroid/util/SparseIntArray;-><init>()V

    iput-object p1, p0, La1/j;->o:Ljava/lang/Object;

    .line 182
    iput p2, p0, La1/j;->l:I

    return-void
.end method

.method public constructor <init>(Lt/r;)V
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 1
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 3
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    iput-object v2, v0, La1/j;->p:Ljava/lang/Object;

    .line 4
    iput-object v1, v0, La1/j;->o:Ljava/lang/Object;

    .line 5
    iget-object v2, v1, Lt/r;->a:Landroid/content/Context;

    iput-object v2, v0, La1/j;->m:Ljava/lang/Object;

    .line 6
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    iget-object v4, v1, Lt/r;->A:Ljava/lang/String;

    const/16 v5, 0x1a

    if-lt v3, v5, :cond_0

    .line 7
    invoke-static {v2, v4}, Lt/K;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/app/Notification$Builder;

    move-result-object v3

    iput-object v3, v0, La1/j;->n:Ljava/lang/Object;

    goto :goto_0

    .line 8
    :cond_0
    new-instance v3, Landroid/app/Notification$Builder;

    iget-object v6, v1, Lt/r;->a:Landroid/content/Context;

    invoke-direct {v3, v6}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;)V

    iput-object v3, v0, La1/j;->n:Ljava/lang/Object;

    .line 9
    :goto_0
    iget-object v3, v1, Lt/r;->F:Landroid/app/Notification;

    .line 10
    iget-object v6, v0, La1/j;->n:Ljava/lang/Object;

    check-cast v6, Landroid/app/Notification$Builder;

    iget-wide v7, v3, Landroid/app/Notification;->when:J

    invoke-virtual {v6, v7, v8}, Landroid/app/Notification$Builder;->setWhen(J)Landroid/app/Notification$Builder;

    move-result-object v6

    iget v7, v3, Landroid/app/Notification;->icon:I

    iget v8, v3, Landroid/app/Notification;->iconLevel:I

    .line 11
    invoke-virtual {v6, v7, v8}, Landroid/app/Notification$Builder;->setSmallIcon(II)Landroid/app/Notification$Builder;

    move-result-object v6

    iget-object v7, v3, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    .line 12
    invoke-virtual {v6, v7}, Landroid/app/Notification$Builder;->setContent(Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;

    move-result-object v6

    iget-object v7, v3, Landroid/app/Notification;->tickerText:Ljava/lang/CharSequence;

    const/4 v8, 0x0

    .line 13
    invoke-virtual {v6, v7, v8}, Landroid/app/Notification$Builder;->setTicker(Ljava/lang/CharSequence;Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;

    move-result-object v6

    iget-object v7, v3, Landroid/app/Notification;->vibrate:[J

    .line 14
    invoke-virtual {v6, v7}, Landroid/app/Notification$Builder;->setVibrate([J)Landroid/app/Notification$Builder;

    move-result-object v6

    iget v7, v3, Landroid/app/Notification;->ledARGB:I

    iget v9, v3, Landroid/app/Notification;->ledOnMS:I

    iget v10, v3, Landroid/app/Notification;->ledOffMS:I

    .line 15
    invoke-virtual {v6, v7, v9, v10}, Landroid/app/Notification$Builder;->setLights(III)Landroid/app/Notification$Builder;

    move-result-object v6

    iget v7, v3, Landroid/app/Notification;->flags:I

    const/4 v9, 0x2

    and-int/2addr v7, v9

    const/4 v10, 0x0

    const/4 v11, 0x1

    if-eqz v7, :cond_1

    move v7, v11

    goto :goto_1

    :cond_1
    move v7, v10

    .line 16
    :goto_1
    invoke-virtual {v6, v7}, Landroid/app/Notification$Builder;->setOngoing(Z)Landroid/app/Notification$Builder;

    move-result-object v6

    iget v7, v3, Landroid/app/Notification;->flags:I

    and-int/lit8 v7, v7, 0x8

    if-eqz v7, :cond_2

    move v7, v11

    goto :goto_2

    :cond_2
    move v7, v10

    .line 17
    :goto_2
    invoke-virtual {v6, v7}, Landroid/app/Notification$Builder;->setOnlyAlertOnce(Z)Landroid/app/Notification$Builder;

    move-result-object v6

    iget v7, v3, Landroid/app/Notification;->flags:I

    and-int/lit8 v7, v7, 0x10

    if-eqz v7, :cond_3

    move v7, v11

    goto :goto_3

    :cond_3
    move v7, v10

    .line 18
    :goto_3
    invoke-virtual {v6, v7}, Landroid/app/Notification$Builder;->setAutoCancel(Z)Landroid/app/Notification$Builder;

    move-result-object v6

    iget v7, v3, Landroid/app/Notification;->defaults:I

    .line 19
    invoke-virtual {v6, v7}, Landroid/app/Notification$Builder;->setDefaults(I)Landroid/app/Notification$Builder;

    move-result-object v6

    iget-object v7, v1, Lt/r;->e:Ljava/lang/CharSequence;

    .line 20
    invoke-virtual {v6, v7}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v6

    iget-object v7, v1, Lt/r;->f:Ljava/lang/CharSequence;

    .line 21
    invoke-virtual {v6, v7}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v6

    .line 22
    invoke-virtual {v6, v8}, Landroid/app/Notification$Builder;->setContentInfo(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v6

    iget-object v7, v1, Lt/r;->g:Landroid/app/PendingIntent;

    .line 23
    invoke-virtual {v6, v7}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    move-result-object v6

    iget-object v7, v3, Landroid/app/Notification;->deleteIntent:Landroid/app/PendingIntent;

    .line 24
    invoke-virtual {v6, v7}, Landroid/app/Notification$Builder;->setDeleteIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    move-result-object v6

    iget-object v7, v1, Lt/r;->h:Landroid/app/PendingIntent;

    iget v12, v3, Landroid/app/Notification;->flags:I

    and-int/lit16 v12, v12, 0x80

    if-eqz v12, :cond_4

    move v12, v11

    goto :goto_4

    :cond_4
    move v12, v10

    .line 25
    :goto_4
    invoke-virtual {v6, v7, v12}, Landroid/app/Notification$Builder;->setFullScreenIntent(Landroid/app/PendingIntent;Z)Landroid/app/Notification$Builder;

    move-result-object v6

    iget v7, v1, Lt/r;->j:I

    .line 26
    invoke-virtual {v6, v7}, Landroid/app/Notification$Builder;->setNumber(I)Landroid/app/Notification$Builder;

    move-result-object v6

    iget v7, v1, Lt/r;->p:I

    iget v12, v1, Lt/r;->q:I

    iget-boolean v13, v1, Lt/r;->r:Z

    .line 27
    invoke-virtual {v6, v7, v12, v13}, Landroid/app/Notification$Builder;->setProgress(IIZ)Landroid/app/Notification$Builder;

    .line 28
    iget-object v6, v0, La1/j;->n:Ljava/lang/Object;

    check-cast v6, Landroid/app/Notification$Builder;

    .line 29
    iget-object v7, v1, Lt/r;->i:Landroidx/core/graphics/drawable/IconCompat;

    if-nez v7, :cond_5

    move-object v2, v8

    goto :goto_5

    .line 30
    :cond_5
    invoke-static {v7, v2}, Lx/b;->f(Landroidx/core/graphics/drawable/IconCompat;Landroid/content/Context;)Landroid/graphics/drawable/Icon;

    move-result-object v2

    .line 31
    :goto_5
    invoke-static {v6, v2}, Lt/I;->b(Landroid/app/Notification$Builder;Landroid/graphics/drawable/Icon;)Landroid/app/Notification$Builder;

    .line 32
    iget-object v2, v0, La1/j;->n:Ljava/lang/Object;

    check-cast v2, Landroid/app/Notification$Builder;

    iget-object v6, v1, Lt/r;->o:Ljava/lang/CharSequence;

    invoke-virtual {v2, v6}, Landroid/app/Notification$Builder;->setSubText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v2

    .line 33
    iget-boolean v6, v1, Lt/r;->m:Z

    invoke-virtual {v2, v6}, Landroid/app/Notification$Builder;->setUsesChronometer(Z)Landroid/app/Notification$Builder;

    move-result-object v2

    .line 34
    iget v6, v1, Lt/r;->k:I

    invoke-virtual {v2, v6}, Landroid/app/Notification$Builder;->setPriority(I)Landroid/app/Notification$Builder;

    .line 35
    iget-object v2, v1, Lt/r;->n:LQ1/D;

    instance-of v6, v2, Lt/w;

    if-eqz v6, :cond_11

    .line 36
    check-cast v2, Lt/w;

    .line 37
    iget-object v6, v2, Lt/w;->h:Landroid/app/PendingIntent;

    const v13, 0x7f070064

    if-nez v6, :cond_6

    .line 38
    iget-object v15, v2, Lt/w;->l:Ljava/lang/Integer;

    iget-object v6, v2, Lt/w;->i:Landroid/app/PendingIntent;

    const v14, 0x7f0d001f

    const v16, 0x7f05002e

    move-object v12, v2

    move-object/from16 v17, v6

    invoke-virtual/range {v12 .. v17}, Lt/w;->j(IILjava/lang/Integer;ILandroid/app/PendingIntent;)Lt/l;

    move-result-object v6

    goto :goto_6

    .line 39
    :cond_6
    iget-object v15, v2, Lt/w;->l:Ljava/lang/Integer;

    const v16, 0x7f05002e

    const v14, 0x7f0d001e

    move-object v12, v2

    move-object/from16 v17, v6

    invoke-virtual/range {v12 .. v17}, Lt/w;->j(IILjava/lang/Integer;ILandroid/app/PendingIntent;)Lt/l;

    move-result-object v6

    .line 40
    :goto_6
    iget-object v7, v2, Lt/w;->g:Landroid/app/PendingIntent;

    if-nez v7, :cond_7

    move-object v7, v8

    goto :goto_a

    .line 41
    :cond_7
    iget-boolean v12, v2, Lt/w;->j:Z

    if-eqz v12, :cond_8

    const v13, 0x7f070062

    goto :goto_7

    :cond_8
    const v13, 0x7f070060

    :goto_7
    if-eqz v12, :cond_9

    const v12, 0x7f0d001d

    :goto_8
    move v14, v12

    goto :goto_9

    :cond_9
    const v12, 0x7f0d001c

    goto :goto_8

    .line 42
    :goto_9
    iget-object v15, v2, Lt/w;->k:Ljava/lang/Integer;

    const v16, 0x7f05002d

    move-object v12, v2

    move-object/from16 v17, v7

    .line 43
    invoke-virtual/range {v12 .. v17}, Lt/w;->j(IILjava/lang/Integer;ILandroid/app/PendingIntent;)Lt/l;

    move-result-object v7

    .line 44
    :goto_a
    new-instance v12, Ljava/util/ArrayList;

    const/4 v13, 0x3

    invoke-direct {v12, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 45
    invoke-virtual {v12, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 46
    iget-object v2, v2, LQ1/D;->b:Ljava/lang/Object;

    check-cast v2, Lt/r;

    iget-object v2, v2, Lt/r;->b:Ljava/util/ArrayList;

    if-eqz v2, :cond_e

    .line 47
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v6, v9

    :cond_a
    :goto_b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_f

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lt/l;

    .line 48
    iget-boolean v14, v13, Lt/l;->g:Z

    if-eqz v14, :cond_b

    .line 49
    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_c

    .line 50
    :cond_b
    const-string v14, "key_action_priority"

    iget-object v15, v13, Lt/l;->a:Landroid/os/Bundle;

    invoke-virtual {v15, v14}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_c

    goto :goto_c

    :cond_c
    if-le v6, v11, :cond_d

    .line 51
    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, -0x1

    :cond_d
    :goto_c
    if-eqz v7, :cond_a

    if-ne v6, v11, :cond_a

    .line 52
    invoke-virtual {v12, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, -0x1

    goto :goto_b

    :cond_e
    move v6, v9

    :cond_f
    if-eqz v7, :cond_10

    if-lt v6, v11, :cond_10

    .line 53
    invoke-virtual {v12, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    :cond_10
    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_12

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lt/l;

    .line 55
    invoke-virtual {v0, v6}, La1/j;->a(Lt/l;)V

    goto :goto_d

    .line 56
    :cond_11
    iget-object v2, v1, Lt/r;->b:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_12

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lt/l;

    .line 57
    invoke-virtual {v0, v6}, La1/j;->a(Lt/l;)V

    goto :goto_e

    .line 58
    :cond_12
    iget-object v2, v1, Lt/r;->x:Landroid/os/Bundle;

    if-eqz v2, :cond_13

    .line 59
    iget-object v6, v0, La1/j;->p:Ljava/lang/Object;

    check-cast v6, Landroid/os/Bundle;

    invoke-virtual {v6, v2}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 60
    :cond_13
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 61
    iget-object v6, v0, La1/j;->n:Ljava/lang/Object;

    check-cast v6, Landroid/app/Notification$Builder;

    iget-boolean v7, v1, Lt/r;->l:Z

    invoke-virtual {v6, v7}, Landroid/app/Notification$Builder;->setShowWhen(Z)Landroid/app/Notification$Builder;

    .line 62
    iget-object v6, v0, La1/j;->n:Ljava/lang/Object;

    check-cast v6, Landroid/app/Notification$Builder;

    invoke-static {v6, v10}, Lt/G;->i(Landroid/app/Notification$Builder;Z)Landroid/app/Notification$Builder;

    .line 63
    iget-object v6, v0, La1/j;->n:Ljava/lang/Object;

    check-cast v6, Landroid/app/Notification$Builder;

    iget-object v7, v1, Lt/r;->s:Ljava/lang/String;

    invoke-static {v6, v7}, Lt/G;->g(Landroid/app/Notification$Builder;Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 64
    iget-object v6, v0, La1/j;->n:Ljava/lang/Object;

    check-cast v6, Landroid/app/Notification$Builder;

    invoke-static {v6, v8}, Lt/G;->j(Landroid/app/Notification$Builder;Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 65
    iget-object v6, v0, La1/j;->n:Ljava/lang/Object;

    check-cast v6, Landroid/app/Notification$Builder;

    iget-boolean v7, v1, Lt/r;->t:Z

    invoke-static {v6, v7}, Lt/G;->h(Landroid/app/Notification$Builder;Z)Landroid/app/Notification$Builder;

    .line 66
    iget v6, v1, Lt/r;->D:I

    iput v6, v0, La1/j;->l:I

    .line 67
    iget-object v6, v0, La1/j;->n:Ljava/lang/Object;

    check-cast v6, Landroid/app/Notification$Builder;

    iget-object v7, v1, Lt/r;->w:Ljava/lang/String;

    invoke-static {v6, v7}, Lt/H;->b(Landroid/app/Notification$Builder;Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 68
    iget-object v6, v0, La1/j;->n:Ljava/lang/Object;

    check-cast v6, Landroid/app/Notification$Builder;

    iget v7, v1, Lt/r;->y:I

    invoke-static {v6, v7}, Lt/H;->c(Landroid/app/Notification$Builder;I)Landroid/app/Notification$Builder;

    .line 69
    iget-object v6, v0, La1/j;->n:Ljava/lang/Object;

    check-cast v6, Landroid/app/Notification$Builder;

    iget v7, v1, Lt/r;->z:I

    invoke-static {v6, v7}, Lt/H;->f(Landroid/app/Notification$Builder;I)Landroid/app/Notification$Builder;

    .line 70
    iget-object v6, v0, La1/j;->n:Ljava/lang/Object;

    check-cast v6, Landroid/app/Notification$Builder;

    invoke-static {v6, v8}, Lt/H;->d(Landroid/app/Notification$Builder;Landroid/app/Notification;)Landroid/app/Notification$Builder;

    .line 71
    iget-object v6, v0, La1/j;->n:Ljava/lang/Object;

    check-cast v6, Landroid/app/Notification$Builder;

    iget-object v7, v3, Landroid/app/Notification;->sound:Landroid/net/Uri;

    iget-object v12, v3, Landroid/app/Notification;->audioAttributes:Landroid/media/AudioAttributes;

    invoke-static {v6, v7, v12}, Lt/H;->e(Landroid/app/Notification$Builder;Landroid/net/Uri;Ljava/lang/Object;)Landroid/app/Notification$Builder;

    .line 72
    iget-object v6, v1, Lt/r;->H:Ljava/util/ArrayList;

    iget-object v7, v1, Lt/r;->c:Ljava/util/ArrayList;

    const/16 v12, 0x1c

    if-ge v2, v12, :cond_1a

    if-nez v7, :cond_14

    move-object v2, v8

    goto :goto_11

    .line 73
    :cond_14
    new-instance v2, Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v13

    invoke-direct {v2, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 74
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_f
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_17

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lt/X;

    .line 75
    iget-object v15, v14, Lt/X;->c:Ljava/lang/String;

    if-eqz v15, :cond_15

    goto :goto_10

    .line 76
    :cond_15
    iget-object v14, v14, Lt/X;->a:Ljava/lang/CharSequence;

    if-eqz v14, :cond_16

    .line 77
    new-instance v15, Ljava/lang/StringBuilder;

    const-string v11, "name:"

    invoke-direct {v15, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v15, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v15

    goto :goto_10

    .line 78
    :cond_16
    const-string v15, ""

    .line 79
    :goto_10
    invoke-virtual {v2, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v11, 0x1

    goto :goto_f

    :cond_17
    :goto_11
    if-nez v2, :cond_18

    goto :goto_12

    :cond_18
    if-nez v6, :cond_19

    move-object v6, v2

    goto :goto_12

    .line 80
    :cond_19
    new-instance v11, Lq/f;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v13

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v14

    add-int/2addr v14, v13

    invoke-direct {v11, v14}, Lq/f;-><init>(I)V

    .line 81
    invoke-virtual {v11, v2}, Lq/f;->addAll(Ljava/util/Collection;)Z

    .line 82
    invoke-virtual {v11, v6}, Lq/f;->addAll(Ljava/util/Collection;)Z

    .line 83
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6, v11}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    :cond_1a
    :goto_12
    if-eqz v6, :cond_1b

    .line 84
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1b

    .line 85
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_13
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1b

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    .line 86
    iget-object v11, v0, La1/j;->n:Ljava/lang/Object;

    check-cast v11, Landroid/app/Notification$Builder;

    invoke-static {v11, v6}, Lt/H;->a(Landroid/app/Notification$Builder;Ljava/lang/String;)Landroid/app/Notification$Builder;

    goto :goto_13

    .line 87
    :cond_1b
    iget-object v2, v1, Lt/r;->d:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-lez v6, :cond_26

    .line 88
    iget-object v6, v1, Lt/r;->x:Landroid/os/Bundle;

    if-nez v6, :cond_1c

    .line 89
    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    iput-object v6, v1, Lt/r;->x:Landroid/os/Bundle;

    .line 90
    :cond_1c
    iget-object v6, v1, Lt/r;->x:Landroid/os/Bundle;

    .line 91
    const-string v11, "android.car.EXTENSIONS"

    invoke-virtual {v6, v11}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v6

    if-nez v6, :cond_1d

    .line 92
    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 93
    :cond_1d
    new-instance v13, Landroid/os/Bundle;

    invoke-direct {v13, v6}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 94
    new-instance v14, Landroid/os/Bundle;

    invoke-direct {v14}, Landroid/os/Bundle;-><init>()V

    move v15, v10

    .line 95
    :goto_14
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v9

    if-ge v15, v9, :cond_24

    .line 96
    invoke-static {v15}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v9

    .line 97
    invoke-virtual {v2, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v18

    move-object/from16 v12, v18

    check-cast v12, Lt/l;

    .line 98
    new-instance v10, Landroid/os/Bundle;

    invoke-direct {v10}, Landroid/os/Bundle;-><init>()V

    .line 99
    invoke-virtual {v12}, Lt/l;->a()Landroidx/core/graphics/drawable/IconCompat;

    move-result-object v19

    if-eqz v19, :cond_1e

    .line 100
    invoke-virtual/range {v19 .. v19}, Landroidx/core/graphics/drawable/IconCompat;->h()I

    move-result v19

    move/from16 v5, v19

    goto :goto_15

    :cond_1e
    const/4 v5, 0x0

    :goto_15
    const-string v8, "icon"

    invoke-virtual {v10, v8, v5}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 101
    const-string v5, "title"

    iget-object v8, v12, Lt/l;->i:Ljava/lang/CharSequence;

    invoke-virtual {v10, v5, v8}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 102
    const-string v5, "actionIntent"

    iget-object v8, v12, Lt/l;->j:Landroid/app/PendingIntent;

    invoke-virtual {v10, v5, v8}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 103
    iget-object v5, v12, Lt/l;->a:Landroid/os/Bundle;

    if-eqz v5, :cond_1f

    .line 104
    new-instance v8, Landroid/os/Bundle;

    invoke-direct {v8, v5}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    goto :goto_16

    .line 105
    :cond_1f
    new-instance v8, Landroid/os/Bundle;

    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    .line 106
    :goto_16
    const-string v5, "android.support.allowGeneratedReplies"

    move-object/from16 v20, v2

    iget-boolean v2, v12, Lt/l;->d:Z

    invoke-virtual {v8, v5, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 107
    const-string v2, "extras"

    invoke-virtual {v10, v2, v8}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 108
    iget-object v5, v12, Lt/l;->c:[Lt/c0;

    if-nez v5, :cond_20

    move-object/from16 v21, v3

    move-object/from16 v24, v4

    move-object/from16 v22, v7

    const/4 v8, 0x0

    goto/16 :goto_19

    .line 109
    :cond_20
    array-length v8, v5

    new-array v8, v8, [Landroid/os/Bundle;

    move-object/from16 v21, v3

    move-object/from16 v22, v7

    const/4 v3, 0x0

    .line 110
    :goto_17
    array-length v7, v5

    if-ge v3, v7, :cond_23

    .line 111
    aget-object v7, v5, v3

    move-object/from16 v23, v5

    .line 112
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 113
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v24, v4

    .line 114
    const-string v4, "resultKey"

    const-string v0, "FlutterLocalNotificationsPluginInputResult"

    invoke-virtual {v5, v4, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 115
    const-string v0, "label"

    iget-object v4, v7, Lt/c0;->a:Ljava/lang/String;

    invoke-virtual {v5, v0, v4}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 116
    const-string v0, "choices"

    iget-object v4, v7, Lt/c0;->b:[Ljava/lang/CharSequence;

    invoke-virtual {v5, v0, v4}, Landroid/os/Bundle;->putCharSequenceArray(Ljava/lang/String;[Ljava/lang/CharSequence;)V

    .line 117
    const-string v0, "allowFreeFormInput"

    iget-boolean v4, v7, Lt/c0;->c:Z

    invoke-virtual {v5, v0, v4}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 118
    iget-object v0, v7, Lt/c0;->d:Landroid/os/Bundle;

    invoke-virtual {v5, v2, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 119
    iget-object v0, v7, Lt/c0;->e:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_22

    .line 120
    new-instance v4, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/HashSet;->size()I

    move-result v7

    invoke-direct {v4, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 121
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_18
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_21

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    .line 122
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_18

    .line 123
    :cond_21
    const-string v0, "allowedDataTypes"

    invoke-virtual {v5, v0, v4}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 124
    :cond_22
    aput-object v5, v8, v3

    add-int/lit8 v3, v3, 0x1

    move-object/from16 v0, p0

    move-object/from16 v5, v23

    move-object/from16 v4, v24

    goto :goto_17

    :cond_23
    move-object/from16 v24, v4

    .line 125
    :goto_19
    const-string v0, "remoteInputs"

    invoke-virtual {v10, v0, v8}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    .line 126
    const-string v0, "showsUserInterface"

    iget-boolean v2, v12, Lt/l;->e:Z

    invoke-virtual {v10, v0, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 127
    const-string v0, "semanticAction"

    iget v2, v12, Lt/l;->f:I

    invoke-virtual {v10, v0, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 128
    invoke-virtual {v14, v9, v10}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    add-int/lit8 v15, v15, 0x1

    const/16 v5, 0x1a

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/16 v12, 0x1c

    move-object/from16 v0, p0

    move-object/from16 v2, v20

    move-object/from16 v3, v21

    move-object/from16 v7, v22

    move-object/from16 v4, v24

    goto/16 :goto_14

    :cond_24
    move-object/from16 v21, v3

    move-object/from16 v24, v4

    move-object/from16 v22, v7

    .line 129
    const-string v0, "invisible_actions"

    invoke-virtual {v6, v0, v14}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 130
    invoke-virtual {v13, v0, v14}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 131
    iget-object v0, v1, Lt/r;->x:Landroid/os/Bundle;

    if-nez v0, :cond_25

    .line 132
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, v1, Lt/r;->x:Landroid/os/Bundle;

    .line 133
    :cond_25
    iget-object v0, v1, Lt/r;->x:Landroid/os/Bundle;

    .line 134
    invoke-virtual {v0, v11, v6}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    move-object/from16 v0, p0

    .line 135
    iget-object v2, v0, La1/j;->p:Ljava/lang/Object;

    check-cast v2, Landroid/os/Bundle;

    invoke-virtual {v2, v11, v13}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    goto :goto_1a

    :cond_26
    move-object/from16 v21, v3

    move-object/from16 v24, v4

    move-object/from16 v22, v7

    .line 136
    :goto_1a
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 137
    iget-object v3, v0, La1/j;->n:Ljava/lang/Object;

    check-cast v3, Landroid/app/Notification$Builder;

    iget-object v4, v1, Lt/r;->x:Landroid/os/Bundle;

    invoke-virtual {v3, v4}, Landroid/app/Notification$Builder;->setExtras(Landroid/os/Bundle;)Landroid/app/Notification$Builder;

    .line 138
    iget-object v3, v0, La1/j;->n:Ljava/lang/Object;

    check-cast v3, Landroid/app/Notification$Builder;

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lt/J;->e(Landroid/app/Notification$Builder;[Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    const/16 v3, 0x1a

    if-lt v2, v3, :cond_28

    .line 139
    iget-object v3, v0, La1/j;->n:Ljava/lang/Object;

    check-cast v3, Landroid/app/Notification$Builder;

    const/4 v5, 0x0

    invoke-static {v3, v5}, Lt/K;->b(Landroid/app/Notification$Builder;I)Landroid/app/Notification$Builder;

    .line 140
    iget-object v3, v0, La1/j;->n:Ljava/lang/Object;

    check-cast v3, Landroid/app/Notification$Builder;

    invoke-static {v3, v4}, Lt/K;->e(Landroid/app/Notification$Builder;Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 141
    iget-object v3, v0, La1/j;->n:Ljava/lang/Object;

    check-cast v3, Landroid/app/Notification$Builder;

    iget-object v4, v1, Lt/r;->B:Ljava/lang/String;

    invoke-static {v3, v4}, Lt/K;->f(Landroid/app/Notification$Builder;Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 142
    iget-object v3, v0, La1/j;->n:Ljava/lang/Object;

    check-cast v3, Landroid/app/Notification$Builder;

    iget-wide v4, v1, Lt/r;->C:J

    invoke-static {v3, v4, v5}, Lt/K;->g(Landroid/app/Notification$Builder;J)Landroid/app/Notification$Builder;

    .line 143
    iget-object v3, v0, La1/j;->n:Ljava/lang/Object;

    check-cast v3, Landroid/app/Notification$Builder;

    iget v4, v1, Lt/r;->D:I

    invoke-static {v3, v4}, Lt/K;->d(Landroid/app/Notification$Builder;I)Landroid/app/Notification$Builder;

    .line 144
    iget-boolean v3, v1, Lt/r;->v:Z

    if-eqz v3, :cond_27

    .line 145
    iget-object v3, v0, La1/j;->n:Ljava/lang/Object;

    check-cast v3, Landroid/app/Notification$Builder;

    iget-boolean v4, v1, Lt/r;->u:Z

    invoke-static {v3, v4}, Lt/K;->c(Landroid/app/Notification$Builder;Z)Landroid/app/Notification$Builder;

    .line 146
    :cond_27
    invoke-static/range {v24 .. v24}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_28

    .line 147
    iget-object v3, v0, La1/j;->n:Ljava/lang/Object;

    check-cast v3, Landroid/app/Notification$Builder;

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Landroid/app/Notification$Builder;->setSound(Landroid/net/Uri;)Landroid/app/Notification$Builder;

    move-result-object v3

    const/4 v5, 0x0

    .line 148
    invoke-virtual {v3, v5}, Landroid/app/Notification$Builder;->setDefaults(I)Landroid/app/Notification$Builder;

    move-result-object v3

    .line 149
    invoke-virtual {v3, v5, v5, v5}, Landroid/app/Notification$Builder;->setLights(III)Landroid/app/Notification$Builder;

    move-result-object v3

    .line 150
    invoke-virtual {v3, v4}, Landroid/app/Notification$Builder;->setVibrate([J)Landroid/app/Notification$Builder;

    :cond_28
    const/16 v3, 0x1c

    if-lt v2, v3, :cond_29

    .line 151
    invoke-virtual/range {v22 .. v22}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_29

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lt/X;

    .line 152
    iget-object v4, v0, La1/j;->n:Ljava/lang/Object;

    check-cast v4, Landroid/app/Notification$Builder;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    invoke-static {v3}, Lt/W;->b(Lt/X;)Landroid/app/Person;

    move-result-object v3

    .line 154
    invoke-static {v4, v3}, Lt/L;->a(Landroid/app/Notification$Builder;Landroid/app/Person;)Landroid/app/Notification$Builder;

    goto :goto_1b

    .line 155
    :cond_29
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1d

    if-lt v2, v3, :cond_2a

    .line 156
    iget-object v3, v0, La1/j;->n:Ljava/lang/Object;

    check-cast v3, Landroid/app/Notification$Builder;

    iget-boolean v4, v1, Lt/r;->E:Z

    invoke-static {v3, v4}, Lt/M;->a(Landroid/app/Notification$Builder;Z)Landroid/app/Notification$Builder;

    .line 157
    iget-object v3, v0, La1/j;->n:Ljava/lang/Object;

    check-cast v3, Landroid/app/Notification$Builder;

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lt/M;->b(Landroid/app/Notification$Builder;Landroid/app/Notification$BubbleMetadata;)Landroid/app/Notification$Builder;

    .line 158
    :cond_2a
    iget-boolean v1, v1, Lt/r;->G:Z

    if-eqz v1, :cond_2d

    .line 159
    iget-object v1, v0, La1/j;->o:Ljava/lang/Object;

    check-cast v1, Lt/r;

    iget-boolean v1, v1, Lt/r;->t:Z

    if-eqz v1, :cond_2b

    const/4 v1, 0x2

    .line 160
    iput v1, v0, La1/j;->l:I

    goto :goto_1c

    :cond_2b
    const/4 v1, 0x1

    .line 161
    iput v1, v0, La1/j;->l:I

    .line 162
    :goto_1c
    iget-object v1, v0, La1/j;->n:Ljava/lang/Object;

    check-cast v1, Landroid/app/Notification$Builder;

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Landroid/app/Notification$Builder;->setVibrate([J)Landroid/app/Notification$Builder;

    .line 163
    iget-object v1, v0, La1/j;->n:Ljava/lang/Object;

    check-cast v1, Landroid/app/Notification$Builder;

    invoke-virtual {v1, v3}, Landroid/app/Notification$Builder;->setSound(Landroid/net/Uri;)Landroid/app/Notification$Builder;

    move-object/from16 v1, v21

    .line 164
    iget v3, v1, Landroid/app/Notification;->defaults:I

    and-int/lit8 v3, v3, -0x4

    .line 165
    iput v3, v1, Landroid/app/Notification;->defaults:I

    .line 166
    iget-object v1, v0, La1/j;->n:Ljava/lang/Object;

    check-cast v1, Landroid/app/Notification$Builder;

    invoke-virtual {v1, v3}, Landroid/app/Notification$Builder;->setDefaults(I)Landroid/app/Notification$Builder;

    const/16 v1, 0x1a

    if-lt v2, v1, :cond_2d

    .line 167
    iget-object v1, v0, La1/j;->o:Ljava/lang/Object;

    check-cast v1, Lt/r;

    iget-object v1, v1, Lt/r;->s:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_2c

    .line 168
    iget-object v1, v0, La1/j;->n:Ljava/lang/Object;

    check-cast v1, Landroid/app/Notification$Builder;

    const-string v2, "silent"

    invoke-static {v1, v2}, Lt/G;->g(Landroid/app/Notification$Builder;Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 169
    :cond_2c
    iget-object v1, v0, La1/j;->n:Ljava/lang/Object;

    check-cast v1, Landroid/app/Notification$Builder;

    iget v2, v0, La1/j;->l:I

    invoke-static {v1, v2}, Lt/K;->d(Landroid/app/Notification$Builder;I)Landroid/app/Notification$Builder;

    :cond_2d
    return-void
.end method


# virtual methods
.method public a(Lt/l;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Lt/l;->a()Landroidx/core/graphics/drawable/IconCompat;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-static {v0, v1}, Lx/b;->f(Landroidx/core/graphics/drawable/IconCompat;Landroid/content/Context;)Landroid/graphics/drawable/Icon;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    :cond_0
    iget-object v0, p1, Lt/l;->i:Ljava/lang/CharSequence;

    .line 13
    .line 14
    iget-object v2, p1, Lt/l;->j:Landroid/app/PendingIntent;

    .line 15
    .line 16
    invoke-static {v1, v0, v2}, Lt/I;->a(Landroid/graphics/drawable/Icon;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)Landroid/app/Notification$Action$Builder;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const/4 v1, 0x0

    .line 21
    iget-object v2, p1, Lt/l;->c:[Lt/c0;

    .line 22
    .line 23
    if-eqz v2, :cond_2

    .line 24
    .line 25
    array-length v3, v2

    .line 26
    new-array v3, v3, [Landroid/app/RemoteInput;

    .line 27
    .line 28
    move v4, v1

    .line 29
    :goto_0
    array-length v5, v2

    .line 30
    if-ge v4, v5, :cond_1

    .line 31
    .line 32
    aget-object v5, v2, v4

    .line 33
    .line 34
    invoke-static {v5}, Lt/c0;->a(Lt/c0;)Landroid/app/RemoteInput;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    aput-object v5, v3, v4

    .line 39
    .line 40
    add-int/lit8 v4, v4, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    array-length v2, v3

    .line 44
    move v4, v1

    .line 45
    :goto_1
    if-ge v4, v2, :cond_2

    .line 46
    .line 47
    aget-object v5, v3, v4

    .line 48
    .line 49
    invoke-static {v0, v5}, Lt/G;->c(Landroid/app/Notification$Action$Builder;Landroid/app/RemoteInput;)Landroid/app/Notification$Action$Builder;

    .line 50
    .line 51
    .line 52
    add-int/lit8 v4, v4, 0x1

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_2
    iget-object v2, p1, Lt/l;->a:Landroid/os/Bundle;

    .line 56
    .line 57
    if-eqz v2, :cond_3

    .line 58
    .line 59
    new-instance v3, Landroid/os/Bundle;

    .line 60
    .line 61
    invoke-direct {v3, v2}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 62
    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_3
    new-instance v3, Landroid/os/Bundle;

    .line 66
    .line 67
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 68
    .line 69
    .line 70
    :goto_2
    iget-boolean v2, p1, Lt/l;->d:Z

    .line 71
    .line 72
    const-string v4, "android.support.allowGeneratedReplies"

    .line 73
    .line 74
    invoke-virtual {v3, v4, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 75
    .line 76
    .line 77
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 78
    .line 79
    invoke-static {v0, v2}, Lt/J;->a(Landroid/app/Notification$Action$Builder;Z)Landroid/app/Notification$Action$Builder;

    .line 80
    .line 81
    .line 82
    const-string v2, "android.support.action.semanticAction"

    .line 83
    .line 84
    iget v5, p1, Lt/l;->f:I

    .line 85
    .line 86
    invoke-virtual {v3, v2, v5}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 87
    .line 88
    .line 89
    const/16 v2, 0x1c

    .line 90
    .line 91
    if-lt v4, v2, :cond_4

    .line 92
    .line 93
    invoke-static {v0, v5}, Lt/L;->b(Landroid/app/Notification$Action$Builder;I)Landroid/app/Notification$Action$Builder;

    .line 94
    .line 95
    .line 96
    :cond_4
    const/16 v2, 0x1d

    .line 97
    .line 98
    if-lt v4, v2, :cond_5

    .line 99
    .line 100
    iget-boolean v2, p1, Lt/l;->g:Z

    .line 101
    .line 102
    invoke-static {v0, v2}, Lt/M;->c(Landroid/app/Notification$Action$Builder;Z)Landroid/app/Notification$Action$Builder;

    .line 103
    .line 104
    .line 105
    :cond_5
    const/16 v2, 0x1f

    .line 106
    .line 107
    if-lt v4, v2, :cond_6

    .line 108
    .line 109
    invoke-static {v0, v1}, Lt/N;->a(Landroid/app/Notification$Action$Builder;Z)Landroid/app/Notification$Action$Builder;

    .line 110
    .line 111
    .line 112
    :cond_6
    const-string v1, "android.support.action.showsUserInterface"

    .line 113
    .line 114
    iget-boolean p1, p1, Lt/l;->e:Z

    .line 115
    .line 116
    invoke-virtual {v3, v1, p1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 117
    .line 118
    .line 119
    invoke-static {v0, v3}, Lt/G;->b(Landroid/app/Notification$Action$Builder;Landroid/os/Bundle;)Landroid/app/Notification$Action$Builder;

    .line 120
    .line 121
    .line 122
    iget-object p1, p0, La1/j;->n:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast p1, Landroid/app/Notification$Builder;

    .line 125
    .line 126
    invoke-static {v0}, Lt/G;->d(Landroid/app/Notification$Action$Builder;)Landroid/app/Notification$Action;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    invoke-static {p1, v0}, Lt/G;->a(Landroid/app/Notification$Builder;Landroid/app/Notification$Action;)Landroid/app/Notification$Builder;

    .line 131
    .line 132
    .line 133
    return-void
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
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
.end method

.method public b(Ld0/p;)V
    .locals 35

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual/range {p1 .. p1}, Ld0/p;->v()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v3, 0x2

    .line 10
    if-eq v2, v3, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object v2, v0, La1/j;->p:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v2, Ll1/C;

    .line 16
    .line 17
    iget v4, v2, Ll1/C;->a:I

    .line 18
    .line 19
    const/4 v5, 0x1

    .line 20
    const/4 v6, 0x0

    .line 21
    iget-object v7, v2, Ll1/C;->c:Ljava/util/List;

    .line 22
    .line 23
    if-eq v4, v5, :cond_2

    .line 24
    .line 25
    if-eq v4, v3, :cond_2

    .line 26
    .line 27
    iget v4, v2, Ll1/C;->n:I

    .line 28
    .line 29
    if-ne v4, v5, :cond_1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    new-instance v4, Ld0/u;

    .line 33
    .line 34
    invoke-interface {v7, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v8

    .line 38
    check-cast v8, Ld0/u;

    .line 39
    .line 40
    invoke-virtual {v8}, Ld0/u;->d()J

    .line 41
    .line 42
    .line 43
    move-result-wide v8

    .line 44
    invoke-direct {v4, v8, v9}, Ld0/u;-><init>(J)V

    .line 45
    .line 46
    .line 47
    invoke-interface {v7, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_2
    :goto_0
    invoke-interface {v7, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    check-cast v4, Ld0/u;

    .line 56
    .line 57
    :goto_1
    invoke-virtual/range {p1 .. p1}, Ld0/p;->v()I

    .line 58
    .line 59
    .line 60
    move-result v7

    .line 61
    and-int/lit16 v7, v7, 0x80

    .line 62
    .line 63
    if-nez v7, :cond_3

    .line 64
    .line 65
    return-void

    .line 66
    :cond_3
    invoke-virtual {v1, v5}, Ld0/p;->I(I)V

    .line 67
    .line 68
    .line 69
    invoke-virtual/range {p1 .. p1}, Ld0/p;->B()I

    .line 70
    .line 71
    .line 72
    move-result v7

    .line 73
    const/4 v8, 0x3

    .line 74
    invoke-virtual {v1, v8}, Ld0/p;->I(I)V

    .line 75
    .line 76
    .line 77
    iget-object v9, v0, La1/j;->m:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v9, LF0/M;

    .line 80
    .line 81
    iget-object v10, v9, LF0/M;->b:[B

    .line 82
    .line 83
    invoke-virtual {v1, v10, v6, v3}, Ld0/p;->g([BII)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v9, v6}, LF0/M;->r(I)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v9, v8}, LF0/M;->u(I)V

    .line 90
    .line 91
    .line 92
    const/16 v10, 0xd

    .line 93
    .line 94
    invoke-virtual {v9, v10}, LF0/M;->i(I)I

    .line 95
    .line 96
    .line 97
    move-result v11

    .line 98
    iput v11, v2, Ll1/C;->t:I

    .line 99
    .line 100
    iget-object v11, v9, LF0/M;->b:[B

    .line 101
    .line 102
    invoke-virtual {v1, v11, v6, v3}, Ld0/p;->g([BII)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v9, v6}, LF0/M;->r(I)V

    .line 106
    .line 107
    .line 108
    const/4 v11, 0x4

    .line 109
    invoke-virtual {v9, v11}, LF0/M;->u(I)V

    .line 110
    .line 111
    .line 112
    const/16 v12, 0xc

    .line 113
    .line 114
    invoke-virtual {v9, v12}, LF0/M;->i(I)I

    .line 115
    .line 116
    .line 117
    move-result v13

    .line 118
    invoke-virtual {v1, v13}, Ld0/p;->I(I)V

    .line 119
    .line 120
    .line 121
    iget-object v13, v2, Ll1/C;->f:LA/j;

    .line 122
    .line 123
    iget v14, v2, Ll1/C;->a:I

    .line 124
    .line 125
    const/16 v15, 0x2000

    .line 126
    .line 127
    const/16 v5, 0x15

    .line 128
    .line 129
    if-ne v14, v3, :cond_4

    .line 130
    .line 131
    iget-object v3, v2, Ll1/C;->r:Ll1/F;

    .line 132
    .line 133
    if-nez v3, :cond_4

    .line 134
    .line 135
    new-instance v3, Ld0/o;

    .line 136
    .line 137
    sget-object v21, Ld0/w;->f:[B

    .line 138
    .line 139
    const/16 v18, 0x0

    .line 140
    .line 141
    const/16 v19, 0x0

    .line 142
    .line 143
    const/16 v17, 0x15

    .line 144
    .line 145
    const/16 v20, 0x0

    .line 146
    .line 147
    move-object/from16 v16, v3

    .line 148
    .line 149
    invoke-direct/range {v16 .. v21}, Ld0/o;-><init>(ILjava/lang/String;ILjava/util/ArrayList;[B)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v13, v5, v3}, LA/j;->h(ILd0/o;)Ll1/F;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    iput-object v3, v2, Ll1/C;->r:Ll1/F;

    .line 157
    .line 158
    if-eqz v3, :cond_4

    .line 159
    .line 160
    iget-object v12, v2, Ll1/C;->m:LF0/s;

    .line 161
    .line 162
    new-instance v11, Ll1/E;

    .line 163
    .line 164
    invoke-direct {v11, v7, v5, v15}, Ll1/E;-><init>(III)V

    .line 165
    .line 166
    .line 167
    invoke-interface {v3, v4, v12, v11}, Ll1/F;->c(Ld0/u;LF0/s;Ll1/E;)V

    .line 168
    .line 169
    .line 170
    :cond_4
    iget-object v3, v0, La1/j;->n:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast v3, Landroid/util/SparseArray;

    .line 173
    .line 174
    invoke-virtual {v3}, Landroid/util/SparseArray;->clear()V

    .line 175
    .line 176
    .line 177
    iget-object v11, v0, La1/j;->o:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast v11, Landroid/util/SparseIntArray;

    .line 180
    .line 181
    invoke-virtual {v11}, Landroid/util/SparseIntArray;->clear()V

    .line 182
    .line 183
    .line 184
    invoke-virtual/range {p1 .. p1}, Ld0/p;->a()I

    .line 185
    .line 186
    .line 187
    move-result v12

    .line 188
    :goto_2
    iget-object v15, v2, Ll1/C;->i:Landroid/util/SparseBooleanArray;

    .line 189
    .line 190
    if-lez v12, :cond_1d

    .line 191
    .line 192
    iget-object v5, v9, LF0/M;->b:[B

    .line 193
    .line 194
    const/4 v10, 0x5

    .line 195
    invoke-virtual {v1, v5, v6, v10}, Ld0/p;->g([BII)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v9, v6}, LF0/M;->r(I)V

    .line 199
    .line 200
    .line 201
    const/16 v5, 0x8

    .line 202
    .line 203
    invoke-virtual {v9, v5}, LF0/M;->i(I)I

    .line 204
    .line 205
    .line 206
    move-result v5

    .line 207
    invoke-virtual {v9, v8}, LF0/M;->u(I)V

    .line 208
    .line 209
    .line 210
    const/16 v6, 0xd

    .line 211
    .line 212
    invoke-virtual {v9, v6}, LF0/M;->i(I)I

    .line 213
    .line 214
    .line 215
    move-result v8

    .line 216
    const/4 v6, 0x4

    .line 217
    invoke-virtual {v9, v6}, LF0/M;->u(I)V

    .line 218
    .line 219
    .line 220
    const/16 v6, 0xc

    .line 221
    .line 222
    invoke-virtual {v9, v6}, LF0/M;->i(I)I

    .line 223
    .line 224
    .line 225
    move-result v16

    .line 226
    iget v6, v1, Ld0/p;->b:I

    .line 227
    .line 228
    add-int v10, v6, v16

    .line 229
    .line 230
    const/16 v22, 0x0

    .line 231
    .line 232
    const/16 v23, -0x1

    .line 233
    .line 234
    move-object/from16 v26, v22

    .line 235
    .line 236
    move-object/from16 v28, v26

    .line 237
    .line 238
    const/16 v27, 0x0

    .line 239
    .line 240
    move-object/from16 v22, v9

    .line 241
    .line 242
    :goto_3
    iget v9, v1, Ld0/p;->b:I

    .line 243
    .line 244
    if-ge v9, v10, :cond_5

    .line 245
    .line 246
    invoke-virtual/range {p1 .. p1}, Ld0/p;->v()I

    .line 247
    .line 248
    .line 249
    move-result v9

    .line 250
    invoke-virtual/range {p1 .. p1}, Ld0/p;->v()I

    .line 251
    .line 252
    .line 253
    move-result v24

    .line 254
    iget v0, v1, Ld0/p;->b:I

    .line 255
    .line 256
    add-int v0, v0, v24

    .line 257
    .line 258
    if-le v0, v10, :cond_6

    .line 259
    .line 260
    :cond_5
    move-object/from16 v17, v3

    .line 261
    .line 262
    move-object/from16 v30, v4

    .line 263
    .line 264
    move/from16 v31, v7

    .line 265
    .line 266
    move/from16 v32, v8

    .line 267
    .line 268
    const/4 v7, 0x4

    .line 269
    goto/16 :goto_a

    .line 270
    .line 271
    :cond_6
    const/16 v24, 0xac

    .line 272
    .line 273
    const/16 v25, 0x87

    .line 274
    .line 275
    const/16 v29, 0x81

    .line 276
    .line 277
    move-object/from16 v30, v4

    .line 278
    .line 279
    const/4 v4, 0x5

    .line 280
    if-ne v9, v4, :cond_b

    .line 281
    .line 282
    invoke-virtual/range {p1 .. p1}, Ld0/p;->x()J

    .line 283
    .line 284
    .line 285
    move-result-wide v31

    .line 286
    const-wide/32 v33, 0x41432d33

    .line 287
    .line 288
    .line 289
    cmp-long v4, v31, v33

    .line 290
    .line 291
    if-nez v4, :cond_7

    .line 292
    .line 293
    move/from16 v23, v29

    .line 294
    .line 295
    goto :goto_5

    .line 296
    :cond_7
    const-wide/32 v33, 0x45414333

    .line 297
    .line 298
    .line 299
    cmp-long v4, v31, v33

    .line 300
    .line 301
    if-nez v4, :cond_8

    .line 302
    .line 303
    move/from16 v23, v25

    .line 304
    .line 305
    goto :goto_5

    .line 306
    :cond_8
    const-wide/32 v33, 0x41432d34

    .line 307
    .line 308
    .line 309
    cmp-long v4, v31, v33

    .line 310
    .line 311
    if-nez v4, :cond_9

    .line 312
    .line 313
    :goto_4
    move/from16 v23, v24

    .line 314
    .line 315
    goto :goto_5

    .line 316
    :cond_9
    const-wide/32 v24, 0x48455643

    .line 317
    .line 318
    .line 319
    cmp-long v4, v31, v24

    .line 320
    .line 321
    if-nez v4, :cond_a

    .line 322
    .line 323
    const/16 v23, 0x24

    .line 324
    .line 325
    :cond_a
    :goto_5
    move-object/from16 v17, v3

    .line 326
    .line 327
    :goto_6
    move/from16 v31, v7

    .line 328
    .line 329
    move/from16 v32, v8

    .line 330
    .line 331
    :goto_7
    const/4 v7, 0x4

    .line 332
    goto/16 :goto_9

    .line 333
    .line 334
    :cond_b
    const/16 v4, 0x6a

    .line 335
    .line 336
    if-ne v9, v4, :cond_c

    .line 337
    .line 338
    move-object/from16 v17, v3

    .line 339
    .line 340
    move/from16 v31, v7

    .line 341
    .line 342
    move/from16 v32, v8

    .line 343
    .line 344
    move/from16 v23, v29

    .line 345
    .line 346
    goto :goto_7

    .line 347
    :cond_c
    const/16 v4, 0x7a

    .line 348
    .line 349
    if-ne v9, v4, :cond_d

    .line 350
    .line 351
    move-object/from16 v17, v3

    .line 352
    .line 353
    move/from16 v31, v7

    .line 354
    .line 355
    move/from16 v32, v8

    .line 356
    .line 357
    move/from16 v23, v25

    .line 358
    .line 359
    goto :goto_7

    .line 360
    :cond_d
    const/16 v4, 0x7f

    .line 361
    .line 362
    if-ne v9, v4, :cond_10

    .line 363
    .line 364
    invoke-virtual/range {p1 .. p1}, Ld0/p;->v()I

    .line 365
    .line 366
    .line 367
    move-result v4

    .line 368
    const/16 v9, 0x15

    .line 369
    .line 370
    if-ne v4, v9, :cond_e

    .line 371
    .line 372
    goto :goto_4

    .line 373
    :cond_e
    const/16 v9, 0xe

    .line 374
    .line 375
    if-ne v4, v9, :cond_f

    .line 376
    .line 377
    const/16 v23, 0x88

    .line 378
    .line 379
    goto :goto_5

    .line 380
    :cond_f
    const/16 v9, 0x21

    .line 381
    .line 382
    if-ne v4, v9, :cond_a

    .line 383
    .line 384
    const/16 v23, 0x8b

    .line 385
    .line 386
    goto :goto_5

    .line 387
    :cond_10
    const/16 v4, 0x7b

    .line 388
    .line 389
    if-ne v9, v4, :cond_11

    .line 390
    .line 391
    const/16 v4, 0x8a

    .line 392
    .line 393
    move-object/from16 v17, v3

    .line 394
    .line 395
    move/from16 v23, v4

    .line 396
    .line 397
    goto :goto_6

    .line 398
    :cond_11
    const/16 v4, 0xa

    .line 399
    .line 400
    if-ne v9, v4, :cond_12

    .line 401
    .line 402
    sget-object v4, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 403
    .line 404
    const/4 v9, 0x3

    .line 405
    invoke-virtual {v1, v9, v4}, Ld0/p;->t(ILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 406
    .line 407
    .line 408
    move-result-object v4

    .line 409
    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object v4

    .line 413
    invoke-virtual/range {p1 .. p1}, Ld0/p;->v()I

    .line 414
    .line 415
    .line 416
    move-result v27

    .line 417
    move-object/from16 v17, v3

    .line 418
    .line 419
    move-object/from16 v26, v4

    .line 420
    .line 421
    goto :goto_6

    .line 422
    :cond_12
    const/16 v4, 0x59

    .line 423
    .line 424
    if-ne v9, v4, :cond_14

    .line 425
    .line 426
    new-instance v9, Ljava/util/ArrayList;

    .line 427
    .line 428
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 429
    .line 430
    .line 431
    :goto_8
    iget v4, v1, Ld0/p;->b:I

    .line 432
    .line 433
    if-ge v4, v0, :cond_13

    .line 434
    .line 435
    sget-object v4, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 436
    .line 437
    move/from16 v31, v7

    .line 438
    .line 439
    const/4 v7, 0x3

    .line 440
    invoke-virtual {v1, v7, v4}, Ld0/p;->t(ILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 441
    .line 442
    .line 443
    move-result-object v4

    .line 444
    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 445
    .line 446
    .line 447
    move-result-object v4

    .line 448
    invoke-virtual/range {p1 .. p1}, Ld0/p;->v()I

    .line 449
    .line 450
    .line 451
    move-object/from16 v17, v3

    .line 452
    .line 453
    const/4 v7, 0x4

    .line 454
    new-array v3, v7, [B

    .line 455
    .line 456
    move/from16 v32, v8

    .line 457
    .line 458
    const/4 v8, 0x0

    .line 459
    invoke-virtual {v1, v3, v8, v7}, Ld0/p;->g([BII)V

    .line 460
    .line 461
    .line 462
    new-instance v8, Ll1/D;

    .line 463
    .line 464
    invoke-direct {v8, v4, v3}, Ll1/D;-><init>(Ljava/lang/String;[B)V

    .line 465
    .line 466
    .line 467
    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 468
    .line 469
    .line 470
    move-object/from16 v3, v17

    .line 471
    .line 472
    move/from16 v7, v31

    .line 473
    .line 474
    move/from16 v8, v32

    .line 475
    .line 476
    goto :goto_8

    .line 477
    :cond_13
    move-object/from16 v17, v3

    .line 478
    .line 479
    move/from16 v31, v7

    .line 480
    .line 481
    move/from16 v32, v8

    .line 482
    .line 483
    const/4 v7, 0x4

    .line 484
    move-object/from16 v28, v9

    .line 485
    .line 486
    const/16 v23, 0x59

    .line 487
    .line 488
    goto :goto_9

    .line 489
    :cond_14
    move-object/from16 v17, v3

    .line 490
    .line 491
    move/from16 v31, v7

    .line 492
    .line 493
    move/from16 v32, v8

    .line 494
    .line 495
    const/4 v7, 0x4

    .line 496
    const/16 v3, 0x6f

    .line 497
    .line 498
    if-ne v9, v3, :cond_15

    .line 499
    .line 500
    const/16 v3, 0x101

    .line 501
    .line 502
    move/from16 v23, v3

    .line 503
    .line 504
    :cond_15
    :goto_9
    iget v3, v1, Ld0/p;->b:I

    .line 505
    .line 506
    sub-int/2addr v0, v3

    .line 507
    invoke-virtual {v1, v0}, Ld0/p;->I(I)V

    .line 508
    .line 509
    .line 510
    move-object/from16 v0, p0

    .line 511
    .line 512
    move-object/from16 v3, v17

    .line 513
    .line 514
    move-object/from16 v4, v30

    .line 515
    .line 516
    move/from16 v7, v31

    .line 517
    .line 518
    move/from16 v8, v32

    .line 519
    .line 520
    goto/16 :goto_3

    .line 521
    .line 522
    :goto_a
    invoke-virtual {v1, v10}, Ld0/p;->H(I)V

    .line 523
    .line 524
    .line 525
    new-instance v0, Ld0/o;

    .line 526
    .line 527
    iget-object v3, v1, Ld0/p;->a:[B

    .line 528
    .line 529
    invoke-static {v3, v6, v10}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 530
    .line 531
    .line 532
    move-result-object v29

    .line 533
    move-object/from16 v24, v0

    .line 534
    .line 535
    move/from16 v25, v23

    .line 536
    .line 537
    invoke-direct/range {v24 .. v29}, Ld0/o;-><init>(ILjava/lang/String;ILjava/util/ArrayList;[B)V

    .line 538
    .line 539
    .line 540
    const/4 v3, 0x6

    .line 541
    if-eq v5, v3, :cond_16

    .line 542
    .line 543
    const/4 v3, 0x5

    .line 544
    if-ne v5, v3, :cond_17

    .line 545
    .line 546
    :cond_16
    move/from16 v5, v23

    .line 547
    .line 548
    :cond_17
    add-int/lit8 v16, v16, 0x5

    .line 549
    .line 550
    sub-int v12, v12, v16

    .line 551
    .line 552
    const/4 v3, 0x2

    .line 553
    if-ne v14, v3, :cond_18

    .line 554
    .line 555
    move v4, v5

    .line 556
    goto :goto_b

    .line 557
    :cond_18
    move/from16 v4, v32

    .line 558
    .line 559
    :goto_b
    invoke-virtual {v15, v4}, Landroid/util/SparseBooleanArray;->get(I)Z

    .line 560
    .line 561
    .line 562
    move-result v6

    .line 563
    if-eqz v6, :cond_19

    .line 564
    .line 565
    move-object/from16 v3, v17

    .line 566
    .line 567
    const/16 v6, 0x15

    .line 568
    .line 569
    goto :goto_e

    .line 570
    :cond_19
    const/16 v6, 0x15

    .line 571
    .line 572
    if-ne v14, v3, :cond_1a

    .line 573
    .line 574
    if-ne v5, v6, :cond_1a

    .line 575
    .line 576
    iget-object v0, v2, Ll1/C;->r:Ll1/F;

    .line 577
    .line 578
    goto :goto_c

    .line 579
    :cond_1a
    invoke-virtual {v13, v5, v0}, LA/j;->h(ILd0/o;)Ll1/F;

    .line 580
    .line 581
    .line 582
    move-result-object v0

    .line 583
    :goto_c
    if-ne v14, v3, :cond_1c

    .line 584
    .line 585
    const/16 v3, 0x2000

    .line 586
    .line 587
    invoke-virtual {v11, v4, v3}, Landroid/util/SparseIntArray;->get(II)I

    .line 588
    .line 589
    .line 590
    move-result v5

    .line 591
    move/from16 v3, v32

    .line 592
    .line 593
    if-ge v3, v5, :cond_1b

    .line 594
    .line 595
    goto :goto_d

    .line 596
    :cond_1b
    move-object/from16 v3, v17

    .line 597
    .line 598
    goto :goto_e

    .line 599
    :cond_1c
    move/from16 v3, v32

    .line 600
    .line 601
    :goto_d
    invoke-virtual {v11, v4, v3}, Landroid/util/SparseIntArray;->put(II)V

    .line 602
    .line 603
    .line 604
    move-object/from16 v3, v17

    .line 605
    .line 606
    invoke-virtual {v3, v4, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 607
    .line 608
    .line 609
    :goto_e
    move-object/from16 v0, p0

    .line 610
    .line 611
    move v5, v6

    .line 612
    move-object/from16 v9, v22

    .line 613
    .line 614
    move-object/from16 v4, v30

    .line 615
    .line 616
    move/from16 v7, v31

    .line 617
    .line 618
    const/4 v6, 0x0

    .line 619
    const/4 v8, 0x3

    .line 620
    const/16 v10, 0xd

    .line 621
    .line 622
    goto/16 :goto_2

    .line 623
    .line 624
    :cond_1d
    move-object/from16 v30, v4

    .line 625
    .line 626
    move/from16 v31, v7

    .line 627
    .line 628
    invoke-virtual {v11}, Landroid/util/SparseIntArray;->size()I

    .line 629
    .line 630
    .line 631
    move-result v0

    .line 632
    const/4 v8, 0x0

    .line 633
    :goto_f
    iget-object v1, v2, Ll1/C;->h:Landroid/util/SparseArray;

    .line 634
    .line 635
    if-ge v8, v0, :cond_20

    .line 636
    .line 637
    invoke-virtual {v11, v8}, Landroid/util/SparseIntArray;->keyAt(I)I

    .line 638
    .line 639
    .line 640
    move-result v4

    .line 641
    invoke-virtual {v11, v8}, Landroid/util/SparseIntArray;->valueAt(I)I

    .line 642
    .line 643
    .line 644
    move-result v5

    .line 645
    const/4 v6, 0x1

    .line 646
    invoke-virtual {v15, v4, v6}, Landroid/util/SparseBooleanArray;->put(IZ)V

    .line 647
    .line 648
    .line 649
    iget-object v7, v2, Ll1/C;->j:Landroid/util/SparseBooleanArray;

    .line 650
    .line 651
    invoke-virtual {v7, v5, v6}, Landroid/util/SparseBooleanArray;->put(IZ)V

    .line 652
    .line 653
    .line 654
    invoke-virtual {v3, v8}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 655
    .line 656
    .line 657
    move-result-object v6

    .line 658
    check-cast v6, Ll1/F;

    .line 659
    .line 660
    if-eqz v6, :cond_1f

    .line 661
    .line 662
    iget-object v7, v2, Ll1/C;->r:Ll1/F;

    .line 663
    .line 664
    if-eq v6, v7, :cond_1e

    .line 665
    .line 666
    iget-object v7, v2, Ll1/C;->m:LF0/s;

    .line 667
    .line 668
    new-instance v9, Ll1/E;

    .line 669
    .line 670
    move/from16 v10, v31

    .line 671
    .line 672
    const/16 v12, 0x2000

    .line 673
    .line 674
    invoke-direct {v9, v10, v4, v12}, Ll1/E;-><init>(III)V

    .line 675
    .line 676
    .line 677
    move-object/from16 v4, v30

    .line 678
    .line 679
    invoke-interface {v6, v4, v7, v9}, Ll1/F;->c(Ld0/u;LF0/s;Ll1/E;)V

    .line 680
    .line 681
    .line 682
    goto :goto_10

    .line 683
    :cond_1e
    move-object/from16 v4, v30

    .line 684
    .line 685
    move/from16 v10, v31

    .line 686
    .line 687
    const/16 v12, 0x2000

    .line 688
    .line 689
    :goto_10
    invoke-virtual {v1, v5, v6}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 690
    .line 691
    .line 692
    goto :goto_11

    .line 693
    :cond_1f
    move-object/from16 v4, v30

    .line 694
    .line 695
    move/from16 v10, v31

    .line 696
    .line 697
    const/16 v12, 0x2000

    .line 698
    .line 699
    :goto_11
    add-int/lit8 v8, v8, 0x1

    .line 700
    .line 701
    move-object/from16 v30, v4

    .line 702
    .line 703
    move/from16 v31, v10

    .line 704
    .line 705
    goto :goto_f

    .line 706
    :cond_20
    const/4 v5, 0x2

    .line 707
    if-ne v14, v5, :cond_22

    .line 708
    .line 709
    iget-boolean v0, v2, Ll1/C;->o:Z

    .line 710
    .line 711
    if-nez v0, :cond_21

    .line 712
    .line 713
    iget-object v0, v2, Ll1/C;->m:LF0/s;

    .line 714
    .line 715
    invoke-interface {v0}, LF0/s;->j()V

    .line 716
    .line 717
    .line 718
    const/4 v0, 0x0

    .line 719
    iput v0, v2, Ll1/C;->n:I

    .line 720
    .line 721
    const/4 v3, 0x1

    .line 722
    iput-boolean v3, v2, Ll1/C;->o:Z

    .line 723
    .line 724
    :cond_21
    move-object/from16 v4, p0

    .line 725
    .line 726
    goto :goto_13

    .line 727
    :cond_22
    move-object/from16 v4, p0

    .line 728
    .line 729
    const/4 v0, 0x0

    .line 730
    const/4 v3, 0x1

    .line 731
    iget v5, v4, La1/j;->l:I

    .line 732
    .line 733
    invoke-virtual {v1, v5}, Landroid/util/SparseArray;->remove(I)V

    .line 734
    .line 735
    .line 736
    if-ne v14, v3, :cond_23

    .line 737
    .line 738
    move v6, v0

    .line 739
    goto :goto_12

    .line 740
    :cond_23
    iget v0, v2, Ll1/C;->n:I

    .line 741
    .line 742
    add-int/lit8 v6, v0, -0x1

    .line 743
    .line 744
    :goto_12
    iput v6, v2, Ll1/C;->n:I

    .line 745
    .line 746
    if-nez v6, :cond_24

    .line 747
    .line 748
    iget-object v0, v2, Ll1/C;->m:LF0/s;

    .line 749
    .line 750
    invoke-interface {v0}, LF0/s;->j()V

    .line 751
    .line 752
    .line 753
    iput-boolean v3, v2, Ll1/C;->o:Z

    .line 754
    .line 755
    :cond_24
    :goto_13
    return-void
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
.end method

.method public c(Ld0/u;LF0/s;Ll1/E;)V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
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
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
.end method
