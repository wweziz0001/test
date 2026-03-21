.class public abstract Lv3/o;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lv3/p;

.field public final b:Lio/flutter/view/TextureRegistry$SurfaceProducer;

.field public c:LA0/g;

.field public final d:Lh0/s;


# direct methods
.method public constructor <init>(Lv3/p;La0/A;LF0/N;Lio/flutter/view/TextureRegistry$SurfaceProducer;Lw3/d;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lv3/o;->a:Lv3/p;

    .line 5
    .line 6
    iput-object p4, p0, Lv3/o;->b:Lio/flutter/view/TextureRegistry$SurfaceProducer;

    .line 7
    .line 8
    iget p1, p5, Lw3/d;->a:I

    .line 9
    .line 10
    packed-switch p1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    new-instance p1, Lh0/q;

    .line 14
    .line 15
    iget-object v0, p5, Lw3/d;->b:Landroid/content/Context;

    .line 16
    .line 17
    invoke-direct {p1, v0}, Lh0/q;-><init>(Landroid/content/Context;)V

    .line 18
    .line 19
    .line 20
    iget-object p5, p5, Lw3/d;->c:LL0/e;

    .line 21
    .line 22
    invoke-virtual {p5, v0}, LL0/e;->g(Landroid/content/Context;)Lx0/G;

    .line 23
    .line 24
    .line 25
    move-result-object p5

    .line 26
    iget-boolean v0, p1, Lh0/q;->s:Z

    .line 27
    .line 28
    xor-int/lit8 v0, v0, 0x1

    .line 29
    .line 30
    invoke-static {v0}, Ld0/m;->h(Z)V

    .line 31
    .line 32
    .line 33
    new-instance v0, Lh0/p;

    .line 34
    .line 35
    const/4 v1, 0x2

    .line 36
    invoke-direct {v0, p5, v1}, Lh0/p;-><init>(Ljava/lang/Object;I)V

    .line 37
    .line 38
    .line 39
    iput-object v0, p1, Lh0/q;->d:Ll2/h;

    .line 40
    .line 41
    invoke-virtual {p1}, Lh0/q;->a()Lh0/G;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    :goto_0
    move-object v0, p1

    .line 46
    goto :goto_1

    .line 47
    :pswitch_0
    new-instance p1, Lh0/q;

    .line 48
    .line 49
    iget-object v0, p5, Lw3/d;->b:Landroid/content/Context;

    .line 50
    .line 51
    invoke-direct {p1, v0}, Lh0/q;-><init>(Landroid/content/Context;)V

    .line 52
    .line 53
    .line 54
    iget-object p5, p5, Lw3/d;->c:LL0/e;

    .line 55
    .line 56
    invoke-virtual {p5, v0}, LL0/e;->g(Landroid/content/Context;)Lx0/G;

    .line 57
    .line 58
    .line 59
    move-result-object p5

    .line 60
    iget-boolean v0, p1, Lh0/q;->s:Z

    .line 61
    .line 62
    xor-int/lit8 v0, v0, 0x1

    .line 63
    .line 64
    invoke-static {v0}, Ld0/m;->h(Z)V

    .line 65
    .line 66
    .line 67
    new-instance v0, Lh0/p;

    .line 68
    .line 69
    const/4 v1, 0x2

    .line 70
    invoke-direct {v0, p5, v1}, Lh0/p;-><init>(Ljava/lang/Object;I)V

    .line 71
    .line 72
    .line 73
    iput-object v0, p1, Lh0/q;->d:Ll2/h;

    .line 74
    .line 75
    invoke-virtual {p1}, Lh0/q;->a()Lh0/G;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    goto :goto_0

    .line 80
    :goto_1
    iput-object v0, p0, Lv3/o;->d:Lh0/s;

    .line 81
    .line 82
    invoke-static {p2}, Lm2/I;->u(Ljava/lang/Object;)Lm2/b0;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-virtual {v0}, Lh0/G;->d0()V

    .line 87
    .line 88
    .line 89
    new-instance v1, Ljava/util/ArrayList;

    .line 90
    .line 91
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 92
    .line 93
    .line 94
    const/4 p2, 0x0

    .line 95
    move p5, p2

    .line 96
    :goto_2
    iget v2, p1, Lm2/b0;->o:I

    .line 97
    .line 98
    if-ge p5, v2, :cond_0

    .line 99
    .line 100
    invoke-virtual {p1, p5}, Lm2/b0;->get(I)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    check-cast v2, La0/A;

    .line 105
    .line 106
    iget-object v3, v0, Lh0/G;->q:Lx0/G;

    .line 107
    .line 108
    invoke-interface {v3, v2}, Lx0/G;->a(La0/A;)Lx0/J;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    add-int/lit8 p5, p5, 0x1

    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_0
    invoke-virtual {v0}, Lh0/G;->d0()V

    .line 119
    .line 120
    .line 121
    const/4 v2, -0x1

    .line 122
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    const/4 p1, 0x1

    .line 128
    move v5, p1

    .line 129
    invoke-virtual/range {v0 .. v5}, Lh0/G;->Q(Ljava/util/List;IJZ)V

    .line 130
    .line 131
    .line 132
    iget-object p5, p0, Lv3/o;->d:Lh0/s;

    .line 133
    .line 134
    check-cast p5, Lh0/G;

    .line 135
    .line 136
    invoke-virtual {p5}, Lh0/G;->K()V

    .line 137
    .line 138
    .line 139
    iget-object p5, p0, Lv3/o;->d:Lh0/s;

    .line 140
    .line 141
    invoke-virtual {p0, p5, p4}, Lv3/o;->a(Lh0/s;Lio/flutter/view/TextureRegistry$SurfaceProducer;)Lv3/a;

    .line 142
    .line 143
    .line 144
    move-result-object p4

    .line 145
    check-cast p5, Lh0/G;

    .line 146
    .line 147
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    iget-object p5, p5, Lh0/G;->l:Ld0/l;

    .line 151
    .line 152
    invoke-virtual {p5, p4}, Ld0/l;->a(Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    iget-object p4, p0, Lv3/o;->d:Lh0/s;

    .line 156
    .line 157
    iget-boolean p3, p3, LF0/N;->a:Z

    .line 158
    .line 159
    new-instance p5, La0/c;

    .line 160
    .line 161
    const/4 v0, 0x3

    .line 162
    const/4 v1, 0x1

    .line 163
    invoke-direct {p5, v0, p2, v1}, La0/c;-><init>(III)V

    .line 164
    .line 165
    .line 166
    xor-int/2addr p1, p3

    .line 167
    check-cast p4, Lh0/G;

    .line 168
    .line 169
    invoke-virtual {p4, p5, p1}, Lh0/G;->P(La0/c;Z)V

    .line 170
    .line 171
    .line 172
    return-void

    .line 173
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
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
.end method

.method public static c(Ln3/f;Ljava/lang/String;Lv3/o;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string p1, ""

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const-string v0, "."

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    :goto_0
    new-instance v0, LZ1/i;

    .line 17
    .line 18
    const-string v1, "dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.setLooping"

    .line 19
    .line 20
    invoke-static {v1, p1}, Lb3/a;->j(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    sget-object v2, Lv3/f;->d:Lv3/f;

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    invoke-direct {v0, p0, v1, v2, v3}, LZ1/i;-><init>(Ln3/f;Ljava/lang/String;Ln3/m;La0/z;)V

    .line 28
    .line 29
    .line 30
    if-eqz p2, :cond_1

    .line 31
    .line 32
    new-instance v1, Lv3/k;

    .line 33
    .line 34
    const/4 v4, 0x0

    .line 35
    invoke-direct {v1, p2, v4}, Lv3/k;-><init>(Lv3/o;I)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1}, LZ1/i;->E(Ln3/b;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    invoke-virtual {v0, v3}, LZ1/i;->E(Ln3/b;)V

    .line 43
    .line 44
    .line 45
    :goto_1
    new-instance v0, LZ1/i;

    .line 46
    .line 47
    const-string v1, "dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.setVolume"

    .line 48
    .line 49
    invoke-static {v1, p1}, Lb3/a;->j(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-direct {v0, p0, v1, v2, v3}, LZ1/i;-><init>(Ln3/f;Ljava/lang/String;Ln3/m;La0/z;)V

    .line 54
    .line 55
    .line 56
    if-eqz p2, :cond_2

    .line 57
    .line 58
    new-instance v1, Lv3/k;

    .line 59
    .line 60
    const/4 v4, 0x1

    .line 61
    invoke-direct {v1, p2, v4}, Lv3/k;-><init>(Lv3/o;I)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v1}, LZ1/i;->E(Ln3/b;)V

    .line 65
    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_2
    invoke-virtual {v0, v3}, LZ1/i;->E(Ln3/b;)V

    .line 69
    .line 70
    .line 71
    :goto_2
    new-instance v0, LZ1/i;

    .line 72
    .line 73
    const-string v1, "dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.setPlaybackSpeed"

    .line 74
    .line 75
    invoke-static {v1, p1}, Lb3/a;->j(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-direct {v0, p0, v1, v2, v3}, LZ1/i;-><init>(Ln3/f;Ljava/lang/String;Ln3/m;La0/z;)V

    .line 80
    .line 81
    .line 82
    if-eqz p2, :cond_3

    .line 83
    .line 84
    new-instance v1, Lv3/k;

    .line 85
    .line 86
    const/4 v4, 0x2

    .line 87
    invoke-direct {v1, p2, v4}, Lv3/k;-><init>(Lv3/o;I)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0, v1}, LZ1/i;->E(Ln3/b;)V

    .line 91
    .line 92
    .line 93
    goto :goto_3

    .line 94
    :cond_3
    invoke-virtual {v0, v3}, LZ1/i;->E(Ln3/b;)V

    .line 95
    .line 96
    .line 97
    :goto_3
    new-instance v0, LZ1/i;

    .line 98
    .line 99
    const-string v1, "dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.play"

    .line 100
    .line 101
    invoke-static {v1, p1}, Lb3/a;->j(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    invoke-direct {v0, p0, v1, v2, v3}, LZ1/i;-><init>(Ln3/f;Ljava/lang/String;Ln3/m;La0/z;)V

    .line 106
    .line 107
    .line 108
    if-eqz p2, :cond_4

    .line 109
    .line 110
    new-instance v1, Lv3/k;

    .line 111
    .line 112
    const/4 v4, 0x3

    .line 113
    invoke-direct {v1, p2, v4}, Lv3/k;-><init>(Lv3/o;I)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0, v1}, LZ1/i;->E(Ln3/b;)V

    .line 117
    .line 118
    .line 119
    goto :goto_4

    .line 120
    :cond_4
    invoke-virtual {v0, v3}, LZ1/i;->E(Ln3/b;)V

    .line 121
    .line 122
    .line 123
    :goto_4
    new-instance v0, LZ1/i;

    .line 124
    .line 125
    const-string v1, "dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.pause"

    .line 126
    .line 127
    invoke-static {v1, p1}, Lb3/a;->j(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    invoke-direct {v0, p0, v1, v2, v3}, LZ1/i;-><init>(Ln3/f;Ljava/lang/String;Ln3/m;La0/z;)V

    .line 132
    .line 133
    .line 134
    if-eqz p2, :cond_5

    .line 135
    .line 136
    new-instance v1, Lv3/k;

    .line 137
    .line 138
    const/4 v4, 0x4

    .line 139
    invoke-direct {v1, p2, v4}, Lv3/k;-><init>(Lv3/o;I)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0, v1}, LZ1/i;->E(Ln3/b;)V

    .line 143
    .line 144
    .line 145
    goto :goto_5

    .line 146
    :cond_5
    invoke-virtual {v0, v3}, LZ1/i;->E(Ln3/b;)V

    .line 147
    .line 148
    .line 149
    :goto_5
    new-instance v0, LZ1/i;

    .line 150
    .line 151
    const-string v1, "dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.seekTo"

    .line 152
    .line 153
    invoke-static {v1, p1}, Lb3/a;->j(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    invoke-direct {v0, p0, v1, v2, v3}, LZ1/i;-><init>(Ln3/f;Ljava/lang/String;Ln3/m;La0/z;)V

    .line 158
    .line 159
    .line 160
    if-eqz p2, :cond_6

    .line 161
    .line 162
    new-instance v1, Lv3/k;

    .line 163
    .line 164
    const/4 v4, 0x5

    .line 165
    invoke-direct {v1, p2, v4}, Lv3/k;-><init>(Lv3/o;I)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v0, v1}, LZ1/i;->E(Ln3/b;)V

    .line 169
    .line 170
    .line 171
    goto :goto_6

    .line 172
    :cond_6
    invoke-virtual {v0, v3}, LZ1/i;->E(Ln3/b;)V

    .line 173
    .line 174
    .line 175
    :goto_6
    new-instance v0, LZ1/i;

    .line 176
    .line 177
    const-string v1, "dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.getPlaybackState"

    .line 178
    .line 179
    invoke-static {v1, p1}, Lb3/a;->j(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    invoke-direct {v0, p0, p1, v2, v3}, LZ1/i;-><init>(Ln3/f;Ljava/lang/String;Ln3/m;La0/z;)V

    .line 184
    .line 185
    .line 186
    if-eqz p2, :cond_7

    .line 187
    .line 188
    new-instance p0, Lv3/k;

    .line 189
    .line 190
    const/4 p1, 0x6

    .line 191
    invoke-direct {p0, p2, p1}, Lv3/k;-><init>(Lv3/o;I)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v0, p0}, LZ1/i;->E(Ln3/b;)V

    .line 195
    .line 196
    .line 197
    goto :goto_7

    .line 198
    :cond_7
    invoke-virtual {v0, v3}, LZ1/i;->E(Ln3/b;)V

    .line 199
    .line 200
    .line 201
    :goto_7
    return-void
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


# virtual methods
.method public abstract a(Lh0/s;Lio/flutter/view/TextureRegistry$SurfaceProducer;)Lv3/a;
.end method

.method public b()V
    .locals 3

    .line 1
    iget-object v0, p0, Lv3/o;->c:LA0/g;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, v0, LA0/g;->m:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ln3/f;

    .line 8
    .line 9
    iget-object v0, v0, LA0/g;->n:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Ljava/lang/String;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static {v1, v0, v2}, Lv3/o;->c(Ln3/f;Ljava/lang/String;Lv3/o;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lv3/o;->d:Lh0/s;

    .line 18
    .line 19
    check-cast v0, Lh0/G;

    .line 20
    .line 21
    invoke-virtual {v0}, Lh0/G;->L()V

    .line 22
    .line 23
    .line 24
    return-void
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
.end method
