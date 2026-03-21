.class public final Lj0/x;
.super Lq0/r;
.source "SourceFile"

# interfaces
.implements Lh0/U;


# instance fields
.field public final N0:Landroid/content/Context;

.field public final O0:LZ1/c;

.field public final P0:Lj0/v;

.field public final Q0:LZ1/s;

.field public R0:I

.field public S0:Z

.field public T0:Z

.field public U0:La0/p;

.field public V0:La0/p;

.field public W0:J

.field public X0:Z

.field public Y0:Z

.field public Z0:Z

.field public a1:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Lq0/k;Landroid/os/Handler;Lj0/h;Lj0/v;)V
    .locals 3

    .line 1
    sget v0, Ld0/w;->a:I

    .line 2
    .line 3
    const/16 v1, 0x23

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    new-instance v0, LZ1/s;

    .line 8
    .line 9
    const/16 v1, 0xd

    .line 10
    .line 11
    invoke-direct {v0, v1}, LZ1/s;-><init>(I)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    :goto_0
    const/4 v1, 0x1

    .line 17
    const v2, 0x472c4400    # 44100.0f

    .line 18
    .line 19
    .line 20
    invoke-direct {p0, v1, p2, v2}, Lq0/r;-><init>(ILq0/k;F)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, Lj0/x;->N0:Landroid/content/Context;

    .line 28
    .line 29
    iput-object p5, p0, Lj0/x;->P0:Lj0/v;

    .line 30
    .line 31
    iput-object v0, p0, Lj0/x;->Q0:LZ1/s;

    .line 32
    .line 33
    const/16 p1, -0x3e8

    .line 34
    .line 35
    iput p1, p0, Lj0/x;->a1:I

    .line 36
    .line 37
    new-instance p1, LZ1/c;

    .line 38
    .line 39
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 40
    .line 41
    .line 42
    if-eqz p4, :cond_1

    .line 43
    .line 44
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    const/4 p3, 0x0

    .line 49
    :goto_1
    iput-object p3, p1, LZ1/c;->l:Ljava/lang/Object;

    .line 50
    .line 51
    iput-object p4, p1, LZ1/c;->m:Ljava/lang/Object;

    .line 52
    .line 53
    iput-object p1, p0, Lj0/x;->O0:LZ1/c;

    .line 54
    .line 55
    new-instance p1, Landroidx/lifecycle/E;

    .line 56
    .line 57
    const/16 p2, 0xb

    .line 58
    .line 59
    invoke-direct {p1, p0, p2}, Landroidx/lifecycle/E;-><init>(Ljava/lang/Object;I)V

    .line 60
    .line 61
    .line 62
    iput-object p1, p5, Lj0/v;->r:Landroidx/lifecycle/E;

    .line 63
    .line 64
    return-void
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


# virtual methods
.method public final E(F[La0/p;)F
    .locals 5

    .line 1
    array-length v0, p2

    .line 2
    const/4 v1, -0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    move v3, v1

    .line 5
    :goto_0
    if-ge v2, v0, :cond_1

    .line 6
    .line 7
    aget-object v4, p2, v2

    .line 8
    .line 9
    iget v4, v4, La0/p;->D:I

    .line 10
    .line 11
    if-eq v4, v1, :cond_0

    .line 12
    .line 13
    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    if-ne v3, v1, :cond_2

    .line 21
    .line 22
    const/high16 p1, -0x40800000    # -1.0f

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_2
    int-to-float p2, v3

    .line 26
    mul-float/2addr p1, p2

    .line 27
    :goto_1
    return p1
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
.end method

.method public final F(Lq0/j;La0/p;Z)Ljava/util/ArrayList;
    .locals 3

    .line 1
    iget-object v0, p2, La0/p;->n:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object p1, Lm2/b0;->p:Lm2/b0;

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    iget-object v0, p0, Lj0/x;->P0:Lj0/v;

    .line 9
    .line 10
    invoke-virtual {v0, p2}, Lj0/v;->i(La0/p;)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x0

    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    const-string v0, "audio/raw"

    .line 18
    .line 19
    invoke-static {v0, v1, v1}, Lq0/y;->e(Ljava/lang/String;ZZ)Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Lq0/o;

    .line 36
    .line 37
    :goto_0
    if-eqz v0, :cond_2

    .line 38
    .line 39
    invoke-static {v0}, Lm2/I;->u(Ljava/lang/Object;)Lm2/b0;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    goto :goto_1

    .line 44
    :cond_2
    invoke-static {p1, p2, p3, v1}, Lq0/y;->g(Lq0/j;La0/p;ZZ)Lm2/b0;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    :goto_1
    sget-object p3, Lq0/y;->a:Ljava/util/HashMap;

    .line 49
    .line 50
    new-instance p3, Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-direct {p3, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 53
    .line 54
    .line 55
    new-instance p1, LI2/g;

    .line 56
    .line 57
    const/16 v0, 0x16

    .line 58
    .line 59
    invoke-direct {p1, p2, v0}, LI2/g;-><init>(Ljava/lang/Object;I)V

    .line 60
    .line 61
    .line 62
    new-instance p2, Lq0/t;

    .line 63
    .line 64
    invoke-direct {p2, p1}, Lq0/t;-><init>(Lq0/x;)V

    .line 65
    .line 66
    .line 67
    invoke-static {p3, p2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 68
    .line 69
    .line 70
    return-object p3
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

.method public final G(Lq0/o;La0/p;Landroid/media/MediaCrypto;F)Ly2/n;
    .locals 12

    .line 1
    move-object v0, p0

    .line 2
    move-object v2, p1

    .line 3
    move-object v4, p2

    .line 4
    move/from16 v1, p4

    .line 5
    .line 6
    iget-object v3, v0, Lh0/h;->u:[La0/p;

    .line 7
    .line 8
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1, p2}, Lj0/x;->n0(Lq0/o;La0/p;)I

    .line 12
    .line 13
    .line 14
    move-result v5

    .line 15
    array-length v6, v3

    .line 16
    const/4 v7, 0x1

    .line 17
    const/4 v8, 0x0

    .line 18
    if-ne v6, v7, :cond_0

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    array-length v6, v3

    .line 22
    move v9, v8

    .line 23
    :goto_0
    if-ge v9, v6, :cond_2

    .line 24
    .line 25
    aget-object v10, v3, v9

    .line 26
    .line 27
    invoke-virtual {p1, p2, v10}, Lq0/o;->b(La0/p;La0/p;)Lh0/j;

    .line 28
    .line 29
    .line 30
    move-result-object v11

    .line 31
    iget v11, v11, Lh0/j;->d:I

    .line 32
    .line 33
    if-eqz v11, :cond_1

    .line 34
    .line 35
    invoke-virtual {p0, p1, v10}, Lj0/x;->n0(Lq0/o;La0/p;)I

    .line 36
    .line 37
    .line 38
    move-result v10

    .line 39
    invoke-static {v5, v10}, Ljava/lang/Math;->max(II)I

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    :cond_1
    add-int/lit8 v9, v9, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    :goto_1
    iput v5, v0, Lj0/x;->R0:I

    .line 47
    .line 48
    sget v3, Ld0/w;->a:I

    .line 49
    .line 50
    const/16 v5, 0x18

    .line 51
    .line 52
    iget-object v6, v2, Lq0/o;->a:Ljava/lang/String;

    .line 53
    .line 54
    if-ge v3, v5, :cond_4

    .line 55
    .line 56
    const-string v9, "OMX.SEC.aac.dec"

    .line 57
    .line 58
    invoke-virtual {v9, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v9

    .line 62
    if-eqz v9, :cond_4

    .line 63
    .line 64
    const-string v9, "samsung"

    .line 65
    .line 66
    sget-object v10, Ld0/w;->c:Ljava/lang/String;

    .line 67
    .line 68
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v9

    .line 72
    if-eqz v9, :cond_4

    .line 73
    .line 74
    sget-object v9, Ld0/w;->b:Ljava/lang/String;

    .line 75
    .line 76
    const-string v10, "zeroflte"

    .line 77
    .line 78
    invoke-virtual {v9, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 79
    .line 80
    .line 81
    move-result v10

    .line 82
    if-nez v10, :cond_3

    .line 83
    .line 84
    const-string v10, "herolte"

    .line 85
    .line 86
    invoke-virtual {v9, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 87
    .line 88
    .line 89
    move-result v10

    .line 90
    if-nez v10, :cond_3

    .line 91
    .line 92
    const-string v10, "heroqlte"

    .line 93
    .line 94
    invoke-virtual {v9, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 95
    .line 96
    .line 97
    move-result v9

    .line 98
    if-eqz v9, :cond_4

    .line 99
    .line 100
    :cond_3
    move v9, v7

    .line 101
    goto :goto_2

    .line 102
    :cond_4
    move v9, v8

    .line 103
    :goto_2
    iput-boolean v9, v0, Lj0/x;->S0:Z

    .line 104
    .line 105
    const-string v9, "OMX.google.opus.decoder"

    .line 106
    .line 107
    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v9

    .line 111
    if-nez v9, :cond_6

    .line 112
    .line 113
    const-string v9, "c2.android.opus.decoder"

    .line 114
    .line 115
    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v9

    .line 119
    if-nez v9, :cond_6

    .line 120
    .line 121
    const-string v9, "OMX.google.vorbis.decoder"

    .line 122
    .line 123
    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v9

    .line 127
    if-nez v9, :cond_6

    .line 128
    .line 129
    const-string v9, "c2.android.vorbis.decoder"

    .line 130
    .line 131
    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v6

    .line 135
    if-eqz v6, :cond_5

    .line 136
    .line 137
    goto :goto_3

    .line 138
    :cond_5
    move v6, v8

    .line 139
    goto :goto_4

    .line 140
    :cond_6
    :goto_3
    move v6, v7

    .line 141
    :goto_4
    iput-boolean v6, v0, Lj0/x;->T0:Z

    .line 142
    .line 143
    iget v6, v0, Lj0/x;->R0:I

    .line 144
    .line 145
    new-instance v9, Landroid/media/MediaFormat;

    .line 146
    .line 147
    invoke-direct {v9}, Landroid/media/MediaFormat;-><init>()V

    .line 148
    .line 149
    .line 150
    iget-object v10, v2, Lq0/o;->c:Ljava/lang/String;

    .line 151
    .line 152
    const-string v11, "mime"

    .line 153
    .line 154
    invoke-virtual {v9, v11, v10}, Landroid/media/MediaFormat;->setString(Ljava/lang/String;Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    iget v10, v4, La0/p;->C:I

    .line 158
    .line 159
    const-string v11, "channel-count"

    .line 160
    .line 161
    invoke-virtual {v9, v11, v10}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 162
    .line 163
    .line 164
    const-string v10, "sample-rate"

    .line 165
    .line 166
    iget v11, v4, La0/p;->D:I

    .line 167
    .line 168
    invoke-virtual {v9, v10, v11}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 169
    .line 170
    .line 171
    iget-object v10, v4, La0/p;->q:Ljava/util/List;

    .line 172
    .line 173
    invoke-static {v9, v10}, Ld0/m;->x(Landroid/media/MediaFormat;Ljava/util/List;)V

    .line 174
    .line 175
    .line 176
    const-string v10, "max-input-size"

    .line 177
    .line 178
    invoke-static {v9, v10, v6}, Ld0/m;->t(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    .line 179
    .line 180
    .line 181
    const/16 v6, 0x17

    .line 182
    .line 183
    if-lt v3, v6, :cond_8

    .line 184
    .line 185
    const-string v10, "priority"

    .line 186
    .line 187
    invoke-virtual {v9, v10, v8}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 188
    .line 189
    .line 190
    const/high16 v10, -0x40800000    # -1.0f

    .line 191
    .line 192
    cmpl-float v10, v1, v10

    .line 193
    .line 194
    if-eqz v10, :cond_8

    .line 195
    .line 196
    if-ne v3, v6, :cond_7

    .line 197
    .line 198
    sget-object v6, Ld0/w;->d:Ljava/lang/String;

    .line 199
    .line 200
    const-string v10, "ZTE B2017G"

    .line 201
    .line 202
    invoke-virtual {v10, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-result v10

    .line 206
    if-nez v10, :cond_8

    .line 207
    .line 208
    const-string v10, "AXON 7 mini"

    .line 209
    .line 210
    invoke-virtual {v10, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    move-result v6

    .line 214
    if-eqz v6, :cond_7

    .line 215
    .line 216
    goto :goto_5

    .line 217
    :cond_7
    const-string v6, "operating-rate"

    .line 218
    .line 219
    invoke-virtual {v9, v6, v1}, Landroid/media/MediaFormat;->setFloat(Ljava/lang/String;F)V

    .line 220
    .line 221
    .line 222
    :cond_8
    :goto_5
    const/16 v1, 0x1c

    .line 223
    .line 224
    iget-object v6, v4, La0/p;->n:Ljava/lang/String;

    .line 225
    .line 226
    if-gt v3, v1, :cond_9

    .line 227
    .line 228
    const-string v1, "audio/ac4"

    .line 229
    .line 230
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    move-result v1

    .line 234
    if-eqz v1, :cond_9

    .line 235
    .line 236
    const-string v1, "ac4-is-sync"

    .line 237
    .line 238
    invoke-virtual {v9, v1, v7}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 239
    .line 240
    .line 241
    :cond_9
    const-string v1, "audio/raw"

    .line 242
    .line 243
    if-lt v3, v5, :cond_a

    .line 244
    .line 245
    new-instance v5, La0/o;

    .line 246
    .line 247
    invoke-direct {v5}, La0/o;-><init>()V

    .line 248
    .line 249
    .line 250
    invoke-static {v1}, La0/G;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v7

    .line 254
    iput-object v7, v5, La0/o;->m:Ljava/lang/String;

    .line 255
    .line 256
    iget v7, v4, La0/p;->C:I

    .line 257
    .line 258
    iput v7, v5, La0/o;->B:I

    .line 259
    .line 260
    iput v11, v5, La0/o;->C:I

    .line 261
    .line 262
    const/4 v7, 0x4

    .line 263
    iput v7, v5, La0/o;->D:I

    .line 264
    .line 265
    new-instance v10, La0/p;

    .line 266
    .line 267
    invoke-direct {v10, v5}, La0/p;-><init>(La0/o;)V

    .line 268
    .line 269
    .line 270
    iget-object v5, v0, Lj0/x;->P0:Lj0/v;

    .line 271
    .line 272
    invoke-virtual {v5, v10}, Lj0/v;->i(La0/p;)I

    .line 273
    .line 274
    .line 275
    move-result v5

    .line 276
    const/4 v10, 0x2

    .line 277
    if-ne v5, v10, :cond_a

    .line 278
    .line 279
    const-string v5, "pcm-encoding"

    .line 280
    .line 281
    invoke-virtual {v9, v5, v7}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 282
    .line 283
    .line 284
    :cond_a
    const/16 v5, 0x20

    .line 285
    .line 286
    if-lt v3, v5, :cond_b

    .line 287
    .line 288
    const-string v5, "max-output-channel-count"

    .line 289
    .line 290
    const/16 v7, 0x63

    .line 291
    .line 292
    invoke-virtual {v9, v5, v7}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 293
    .line 294
    .line 295
    :cond_b
    const/16 v5, 0x23

    .line 296
    .line 297
    if-lt v3, v5, :cond_c

    .line 298
    .line 299
    iget v3, v0, Lj0/x;->a1:I

    .line 300
    .line 301
    neg-int v3, v3

    .line 302
    invoke-static {v8, v3}, Ljava/lang/Math;->max(II)I

    .line 303
    .line 304
    .line 305
    move-result v3

    .line 306
    const-string v5, "importance"

    .line 307
    .line 308
    invoke-virtual {v9, v5, v3}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 309
    .line 310
    .line 311
    :cond_c
    iget-object v3, v2, Lq0/o;->b:Ljava/lang/String;

    .line 312
    .line 313
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 314
    .line 315
    .line 316
    move-result v3

    .line 317
    if-eqz v3, :cond_d

    .line 318
    .line 319
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 320
    .line 321
    .line 322
    move-result v1

    .line 323
    if-nez v1, :cond_d

    .line 324
    .line 325
    move-object v1, v4

    .line 326
    goto :goto_6

    .line 327
    :cond_d
    const/4 v1, 0x0

    .line 328
    :goto_6
    iput-object v1, v0, Lj0/x;->V0:La0/p;

    .line 329
    .line 330
    new-instance v8, Ly2/n;

    .line 331
    .line 332
    const/4 v5, 0x0

    .line 333
    iget-object v7, v0, Lj0/x;->Q0:LZ1/s;

    .line 334
    .line 335
    move-object v1, v8

    .line 336
    move-object v2, p1

    .line 337
    move-object v3, v9

    .line 338
    move-object v4, p2

    .line 339
    move-object v6, p3

    .line 340
    invoke-direct/range {v1 .. v7}, Ly2/n;-><init>(Lq0/o;Landroid/media/MediaFormat;La0/p;Landroid/view/Surface;Landroid/media/MediaCrypto;LZ1/s;)V

    .line 341
    .line 342
    .line 343
    return-object v8
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
.end method

.method public final H(Lg0/e;)V
    .locals 4

    .line 1
    sget v0, Ld0/w;->a:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v0, p1, Lg0/e;->n:La0/p;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, v0, La0/p;->n:Ljava/lang/String;

    .line 12
    .line 13
    const-string v1, "audio/opus"

    .line 14
    .line 15
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    iget-boolean v0, p0, Lq0/r;->r0:Z

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    iget-object v0, p1, Lg0/e;->s:Ljava/nio/ByteBuffer;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    iget-object p1, p1, Lg0/e;->n:La0/p;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    const/16 v2, 0x8

    .line 40
    .line 41
    if-ne v1, v2, :cond_0

    .line 42
    .line 43
    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getLong()J

    .line 50
    .line 51
    .line 52
    move-result-wide v0

    .line 53
    const-wide/32 v2, 0xbb80

    .line 54
    .line 55
    .line 56
    mul-long/2addr v0, v2

    .line 57
    const-wide/32 v2, 0x3b9aca00

    .line 58
    .line 59
    .line 60
    div-long/2addr v0, v2

    .line 61
    long-to-int v0, v0

    .line 62
    iget-object v1, p0, Lj0/x;->P0:Lj0/v;

    .line 63
    .line 64
    iget-object v2, v1, Lj0/v;->v:Landroid/media/AudioTrack;

    .line 65
    .line 66
    if-eqz v2, :cond_0

    .line 67
    .line 68
    invoke-static {v2}, Lj0/v;->p(Landroid/media/AudioTrack;)Z

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    if-eqz v2, :cond_0

    .line 73
    .line 74
    iget-object v2, v1, Lj0/v;->t:Lj0/p;

    .line 75
    .line 76
    if-eqz v2, :cond_0

    .line 77
    .line 78
    iget-boolean v2, v2, Lj0/p;->k:Z

    .line 79
    .line 80
    if-eqz v2, :cond_0

    .line 81
    .line 82
    iget-object v1, v1, Lj0/v;->v:Landroid/media/AudioTrack;

    .line 83
    .line 84
    iget p1, p1, La0/p;->F:I

    .line 85
    .line 86
    invoke-static {v1, p1, v0}, Lio/flutter/plugin/platform/n;->o(Landroid/media/AudioTrack;II)V

    .line 87
    .line 88
    .line 89
    :cond_0
    return-void
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
    .line 231
    .line 232
    .line 233
    .line 234
.end method

.method public final M(Ljava/lang/Exception;)V
    .locals 4

    .line 1
    const-string v0, "MediaCodecAudioRenderer"

    .line 2
    .line 3
    const-string v1, "Audio codec error"

    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Ld0/m;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lj0/x;->O0:LZ1/c;

    .line 9
    .line 10
    iget-object v1, v0, LZ1/c;->l:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Landroid/os/Handler;

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    new-instance v2, Lj0/f;

    .line 17
    .line 18
    const/4 v3, 0x3

    .line 19
    invoke-direct {v2, v0, p1, v3}, Lj0/f;-><init>(LZ1/c;Ljava/lang/Object;I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
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

.method public final N(JJLjava/lang/String;)V
    .locals 9

    .line 1
    iget-object v1, p0, Lj0/x;->O0:LZ1/c;

    .line 2
    .line 3
    iget-object v0, v1, LZ1/c;->l:Ljava/lang/Object;

    .line 4
    .line 5
    move-object v7, v0

    .line 6
    check-cast v7, Landroid/os/Handler;

    .line 7
    .line 8
    if-eqz v7, :cond_0

    .line 9
    .line 10
    new-instance v8, Lj0/f;

    .line 11
    .line 12
    move-object v0, v8

    .line 13
    move-object v2, p5

    .line 14
    move-wide v3, p1

    .line 15
    move-wide v5, p3

    .line 16
    invoke-direct/range {v0 .. v6}, Lj0/f;-><init>(LZ1/c;Ljava/lang/String;JJ)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v7, v8}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
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

.method public final O(Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lj0/x;->O0:LZ1/c;

    .line 2
    .line 3
    iget-object v1, v0, LZ1/c;->l:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Landroid/os/Handler;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    new-instance v2, Lj0/f;

    .line 10
    .line 11
    const/4 v3, 0x7

    .line 12
    invoke-direct {v2, v0, p1, v3}, Lj0/f;-><init>(LZ1/c;Ljava/lang/Object;I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
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

.method public final P(LZ1/e;)Lh0/j;
    .locals 4

    .line 1
    iget-object v0, p1, LZ1/e;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La0/p;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iput-object v0, p0, Lj0/x;->U0:La0/p;

    .line 9
    .line 10
    invoke-super {p0, p1}, Lq0/r;->P(LZ1/e;)Lh0/j;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iget-object v1, p0, Lj0/x;->O0:LZ1/c;

    .line 15
    .line 16
    iget-object v2, v1, LZ1/c;->l:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v2, Landroid/os/Handler;

    .line 19
    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    new-instance v3, Lj0/f;

    .line 23
    .line 24
    invoke-direct {v3, v1, v0, p1}, Lj0/f;-><init>(LZ1/c;La0/p;Lh0/j;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 28
    .line 29
    .line 30
    :cond_0
    return-object p1
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

.method public final Q(La0/p;Landroid/media/MediaFormat;)V
    .locals 13

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    const/4 v1, 0x7

    .line 4
    const/4 v2, 0x4

    .line 5
    const/4 v3, 0x5

    .line 6
    const/4 v4, 0x3

    .line 7
    const/4 v5, 0x6

    .line 8
    const/4 v6, 0x2

    .line 9
    iget-object v7, p0, Lj0/x;->V0:La0/p;

    .line 10
    .line 11
    const/4 v8, 0x1

    .line 12
    const/4 v9, 0x0

    .line 13
    const/4 v10, 0x0

    .line 14
    if-eqz v7, :cond_0

    .line 15
    .line 16
    move-object p1, v7

    .line 17
    goto/16 :goto_3

    .line 18
    .line 19
    :cond_0
    iget-object v7, p0, Lq0/r;->V:Lq0/l;

    .line 20
    .line 21
    if-nez v7, :cond_1

    .line 22
    .line 23
    goto/16 :goto_3

    .line 24
    .line 25
    :cond_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    iget-object v7, p1, La0/p;->n:Ljava/lang/String;

    .line 29
    .line 30
    const-string v11, "audio/raw"

    .line 31
    .line 32
    invoke-virtual {v11, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v7

    .line 36
    if-eqz v7, :cond_2

    .line 37
    .line 38
    iget v7, p1, La0/p;->E:I

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    sget v7, Ld0/w;->a:I

    .line 42
    .line 43
    const/16 v12, 0x18

    .line 44
    .line 45
    if-lt v7, v12, :cond_3

    .line 46
    .line 47
    const-string v7, "pcm-encoding"

    .line 48
    .line 49
    invoke-virtual {p2, v7}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    .line 50
    .line 51
    .line 52
    move-result v12

    .line 53
    if-eqz v12, :cond_3

    .line 54
    .line 55
    invoke-virtual {p2, v7}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 56
    .line 57
    .line 58
    move-result v7

    .line 59
    goto :goto_0

    .line 60
    :cond_3
    const-string v7, "v-bits-per-sample"

    .line 61
    .line 62
    invoke-virtual {p2, v7}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    .line 63
    .line 64
    .line 65
    move-result v12

    .line 66
    if-eqz v12, :cond_4

    .line 67
    .line 68
    invoke-virtual {p2, v7}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 69
    .line 70
    .line 71
    move-result v7

    .line 72
    invoke-static {v7}, Ld0/w;->z(I)I

    .line 73
    .line 74
    .line 75
    move-result v7

    .line 76
    goto :goto_0

    .line 77
    :cond_4
    move v7, v6

    .line 78
    :goto_0
    new-instance v12, La0/o;

    .line 79
    .line 80
    invoke-direct {v12}, La0/o;-><init>()V

    .line 81
    .line 82
    .line 83
    invoke-static {v11}, La0/G;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v11

    .line 87
    iput-object v11, v12, La0/o;->m:Ljava/lang/String;

    .line 88
    .line 89
    iput v7, v12, La0/o;->D:I

    .line 90
    .line 91
    iget v7, p1, La0/p;->F:I

    .line 92
    .line 93
    iput v7, v12, La0/o;->E:I

    .line 94
    .line 95
    iget v7, p1, La0/p;->G:I

    .line 96
    .line 97
    iput v7, v12, La0/o;->F:I

    .line 98
    .line 99
    iget-object v7, p1, La0/p;->l:La0/F;

    .line 100
    .line 101
    iput-object v7, v12, La0/o;->k:La0/F;

    .line 102
    .line 103
    iget-object v7, p1, La0/p;->a:Ljava/lang/String;

    .line 104
    .line 105
    iput-object v7, v12, La0/o;->a:Ljava/lang/String;

    .line 106
    .line 107
    iget-object v7, p1, La0/p;->b:Ljava/lang/String;

    .line 108
    .line 109
    iput-object v7, v12, La0/o;->b:Ljava/lang/String;

    .line 110
    .line 111
    iget-object v7, p1, La0/p;->c:Lm2/I;

    .line 112
    .line 113
    invoke-static {v7}, Lm2/I;->p(Ljava/util/Collection;)Lm2/I;

    .line 114
    .line 115
    .line 116
    move-result-object v7

    .line 117
    iput-object v7, v12, La0/o;->c:Lm2/I;

    .line 118
    .line 119
    iget-object v7, p1, La0/p;->d:Ljava/lang/String;

    .line 120
    .line 121
    iput-object v7, v12, La0/o;->d:Ljava/lang/String;

    .line 122
    .line 123
    iget v7, p1, La0/p;->e:I

    .line 124
    .line 125
    iput v7, v12, La0/o;->e:I

    .line 126
    .line 127
    iget v7, p1, La0/p;->f:I

    .line 128
    .line 129
    iput v7, v12, La0/o;->f:I

    .line 130
    .line 131
    const-string v7, "channel-count"

    .line 132
    .line 133
    invoke-virtual {p2, v7}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 134
    .line 135
    .line 136
    move-result v7

    .line 137
    iput v7, v12, La0/o;->B:I

    .line 138
    .line 139
    const-string v7, "sample-rate"

    .line 140
    .line 141
    invoke-virtual {p2, v7}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 142
    .line 143
    .line 144
    move-result p2

    .line 145
    iput p2, v12, La0/o;->C:I

    .line 146
    .line 147
    new-instance p2, La0/p;

    .line 148
    .line 149
    invoke-direct {p2, v12}, La0/p;-><init>(La0/o;)V

    .line 150
    .line 151
    .line 152
    iget-boolean v7, p0, Lj0/x;->S0:Z

    .line 153
    .line 154
    iget v11, p2, La0/p;->C:I

    .line 155
    .line 156
    if-eqz v7, :cond_6

    .line 157
    .line 158
    if-ne v11, v5, :cond_6

    .line 159
    .line 160
    iget p1, p1, La0/p;->C:I

    .line 161
    .line 162
    if-ge p1, v5, :cond_6

    .line 163
    .line 164
    new-array v10, p1, [I

    .line 165
    .line 166
    move v0, v9

    .line 167
    :goto_1
    if-ge v0, p1, :cond_5

    .line 168
    .line 169
    aput v0, v10, v0

    .line 170
    .line 171
    add-int/2addr v0, v8

    .line 172
    goto :goto_1

    .line 173
    :cond_5
    :goto_2
    move-object p1, p2

    .line 174
    goto :goto_3

    .line 175
    :cond_6
    iget-boolean p1, p0, Lj0/x;->T0:Z

    .line 176
    .line 177
    if-eqz p1, :cond_5

    .line 178
    .line 179
    if-eq v11, v4, :cond_b

    .line 180
    .line 181
    if-eq v11, v3, :cond_a

    .line 182
    .line 183
    if-eq v11, v5, :cond_9

    .line 184
    .line 185
    if-eq v11, v1, :cond_8

    .line 186
    .line 187
    if-eq v11, v0, :cond_7

    .line 188
    .line 189
    goto :goto_2

    .line 190
    :cond_7
    new-array v10, v0, [I

    .line 191
    .line 192
    fill-array-data v10, :array_0

    .line 193
    .line 194
    .line 195
    goto :goto_2

    .line 196
    :cond_8
    new-array v10, v1, [I

    .line 197
    .line 198
    fill-array-data v10, :array_1

    .line 199
    .line 200
    .line 201
    goto :goto_2

    .line 202
    :cond_9
    new-array v10, v5, [I

    .line 203
    .line 204
    fill-array-data v10, :array_2

    .line 205
    .line 206
    .line 207
    goto :goto_2

    .line 208
    :cond_a
    filled-new-array {v9, v6, v8, v4, v2}, [I

    .line 209
    .line 210
    .line 211
    move-result-object v10

    .line 212
    goto :goto_2

    .line 213
    :cond_b
    filled-new-array {v9, v6, v8}, [I

    .line 214
    .line 215
    .line 216
    move-result-object v10

    .line 217
    goto :goto_2

    .line 218
    :goto_3
    :try_start_0
    sget p2, Ld0/w;->a:I
    :try_end_0
    .catch Lj0/i; {:try_start_0 .. :try_end_0} :catch_0

    .line 219
    .line 220
    const/16 v0, 0x1d

    .line 221
    .line 222
    iget-object v1, p0, Lj0/x;->P0:Lj0/v;

    .line 223
    .line 224
    if-lt p2, v0, :cond_f

    .line 225
    .line 226
    :try_start_1
    iget-boolean v2, p0, Lq0/r;->r0:Z

    .line 227
    .line 228
    if-eqz v2, :cond_d

    .line 229
    .line 230
    iget-object v2, p0, Lh0/h;->o:Lh0/r0;

    .line 231
    .line 232
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 233
    .line 234
    .line 235
    iget v2, v2, Lh0/r0;->a:I

    .line 236
    .line 237
    if-eqz v2, :cond_d

    .line 238
    .line 239
    iget-object v2, p0, Lh0/h;->o:Lh0/r0;

    .line 240
    .line 241
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 242
    .line 243
    .line 244
    iget v2, v2, Lh0/r0;->a:I

    .line 245
    .line 246
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 247
    .line 248
    .line 249
    if-lt p2, v0, :cond_c

    .line 250
    .line 251
    goto :goto_4

    .line 252
    :cond_c
    move v8, v9

    .line 253
    :goto_4
    invoke-static {v8}, Ld0/m;->h(Z)V

    .line 254
    .line 255
    .line 256
    iput v2, v1, Lj0/v;->j:I

    .line 257
    .line 258
    goto :goto_6

    .line 259
    :catch_0
    move-exception p1

    .line 260
    goto :goto_7

    .line 261
    :cond_d
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 262
    .line 263
    .line 264
    if-lt p2, v0, :cond_e

    .line 265
    .line 266
    goto :goto_5

    .line 267
    :cond_e
    move v8, v9

    .line 268
    :goto_5
    invoke-static {v8}, Ld0/m;->h(Z)V

    .line 269
    .line 270
    .line 271
    iput v9, v1, Lj0/v;->j:I

    .line 272
    .line 273
    :cond_f
    :goto_6
    invoke-virtual {v1, p1, v10}, Lj0/v;->d(La0/p;[I)V
    :try_end_1
    .catch Lj0/i; {:try_start_1 .. :try_end_1} :catch_0

    .line 274
    .line 275
    .line 276
    return-void

    .line 277
    :goto_7
    iget-object p2, p1, Lj0/i;->l:La0/p;

    .line 278
    .line 279
    const/16 v0, 0x1389

    .line 280
    .line 281
    invoke-virtual {p0, p1, p2, v9, v0}, Lh0/h;->i(Ljava/lang/Exception;La0/p;ZI)Lh0/o;

    .line 282
    .line 283
    .line 284
    move-result-object p1

    .line 285
    throw p1

    .line 286
    nop

    .line 287
    :array_0
    .array-data 4
        0x0
        0x2
        0x1
        0x7
        0x5
        0x6
        0x3
        0x4
    .end array-data

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
    :array_1
    .array-data 4
        0x0
        0x2
        0x1
        0x6
        0x5
        0x3
        0x4
    .end array-data

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
    :array_2
    .array-data 4
        0x0
        0x2
        0x1
        0x5
        0x3
        0x4
    .end array-data
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
.end method

.method public final R()V
    .locals 1

    .line 1
    iget-object v0, p0, Lj0/x;->P0:Lj0/v;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
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
.end method

.method public final T()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iget-object v1, p0, Lj0/x;->P0:Lj0/v;

    .line 3
    .line 4
    iput-boolean v0, v1, Lj0/v;->L:Z

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
.end method

.method public final X(JJLq0/l;Ljava/nio/ByteBuffer;IIIJZZLa0/p;)Z
    .locals 0

    .line 1
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lj0/x;->V0:La0/p;

    .line 5
    .line 6
    const/4 p2, 0x1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    and-int/lit8 p1, p8, 0x2

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-interface {p5, p7}, Lq0/l;->k(I)V

    .line 17
    .line 18
    .line 19
    return p2

    .line 20
    :cond_0
    iget-object p1, p0, Lj0/x;->P0:Lj0/v;

    .line 21
    .line 22
    if-eqz p12, :cond_2

    .line 23
    .line 24
    if-eqz p5, :cond_1

    .line 25
    .line 26
    invoke-interface {p5, p7}, Lq0/l;->k(I)V

    .line 27
    .line 28
    .line 29
    :cond_1
    iget-object p3, p0, Lq0/r;->I0:Lh0/i;

    .line 30
    .line 31
    iget p4, p3, Lh0/i;->f:I

    .line 32
    .line 33
    add-int/2addr p4, p9

    .line 34
    iput p4, p3, Lh0/i;->f:I

    .line 35
    .line 36
    iput-boolean p2, p1, Lj0/v;->L:Z

    .line 37
    .line 38
    return p2

    .line 39
    :cond_2
    :try_start_0
    invoke-virtual {p1, p10, p11, p6, p9}, Lj0/v;->l(JLjava/nio/ByteBuffer;I)Z

    .line 40
    .line 41
    .line 42
    move-result p1
    :try_end_0
    .catch Lj0/j; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lj0/k; {:try_start_0 .. :try_end_0} :catch_0

    .line 43
    if-eqz p1, :cond_4

    .line 44
    .line 45
    if-eqz p5, :cond_3

    .line 46
    .line 47
    invoke-interface {p5, p7}, Lq0/l;->k(I)V

    .line 48
    .line 49
    .line 50
    :cond_3
    iget-object p1, p0, Lq0/r;->I0:Lh0/i;

    .line 51
    .line 52
    iget p3, p1, Lh0/i;->e:I

    .line 53
    .line 54
    add-int/2addr p3, p9

    .line 55
    iput p3, p1, Lh0/i;->e:I

    .line 56
    .line 57
    return p2

    .line 58
    :cond_4
    const/4 p1, 0x0

    .line 59
    return p1

    .line 60
    :catch_0
    move-exception p1

    .line 61
    iget-boolean p2, p0, Lq0/r;->r0:Z

    .line 62
    .line 63
    if-eqz p2, :cond_5

    .line 64
    .line 65
    iget-object p2, p0, Lh0/h;->o:Lh0/r0;

    .line 66
    .line 67
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    iget p2, p2, Lh0/r0;->a:I

    .line 71
    .line 72
    if-eqz p2, :cond_5

    .line 73
    .line 74
    const/16 p2, 0x138b

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_5
    const/16 p2, 0x138a

    .line 78
    .line 79
    :goto_0
    iget-boolean p3, p1, Lj0/k;->m:Z

    .line 80
    .line 81
    invoke-virtual {p0, p1, p14, p3, p2}, Lh0/h;->i(Ljava/lang/Exception;La0/p;ZI)Lh0/o;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    throw p1

    .line 86
    :catch_1
    move-exception p1

    .line 87
    iget-object p2, p0, Lj0/x;->U0:La0/p;

    .line 88
    .line 89
    iget-boolean p3, p0, Lq0/r;->r0:Z

    .line 90
    .line 91
    if-eqz p3, :cond_6

    .line 92
    .line 93
    iget-object p3, p0, Lh0/h;->o:Lh0/r0;

    .line 94
    .line 95
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    iget p3, p3, Lh0/r0;->a:I

    .line 99
    .line 100
    if-eqz p3, :cond_6

    .line 101
    .line 102
    const/16 p3, 0x138c

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_6
    const/16 p3, 0x1389

    .line 106
    .line 107
    :goto_1
    iget-boolean p4, p1, Lj0/j;->m:Z

    .line 108
    .line 109
    invoke-virtual {p0, p1, p2, p4, p3}, Lh0/h;->i(Ljava/lang/Exception;La0/p;ZI)Lh0/o;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    throw p1
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
    .line 231
    .line 232
.end method

.method public final a(La0/J;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lj0/x;->P0:Lj0/v;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v1, La0/J;

    .line 7
    .line 8
    iget v2, p1, La0/J;->a:F

    .line 9
    .line 10
    const v3, 0x3dcccccd    # 0.1f

    .line 11
    .line 12
    .line 13
    const/high16 v4, 0x41000000    # 8.0f

    .line 14
    .line 15
    invoke-static {v2, v3, v4}, Ld0/w;->h(FFF)F

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    iget v5, p1, La0/J;->b:F

    .line 20
    .line 21
    invoke-static {v5, v3, v4}, Ld0/w;->h(FFF)F

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    invoke-direct {v1, v2, v3}, La0/J;-><init>(FF)V

    .line 26
    .line 27
    .line 28
    iput-object v1, v0, Lj0/v;->C:La0/J;

    .line 29
    .line 30
    invoke-virtual {v0}, Lj0/v;->x()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_0

    .line 35
    .line 36
    invoke-virtual {v0}, Lj0/v;->v()V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    new-instance v1, Lj0/q;

    .line 41
    .line 42
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    move-object v2, v1

    .line 53
    move-object v3, p1

    .line 54
    invoke-direct/range {v2 .. v7}, Lj0/q;-><init>(La0/J;JJ)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Lj0/v;->o()Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-eqz p1, :cond_1

    .line 62
    .line 63
    iput-object v1, v0, Lj0/v;->A:Lj0/q;

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    iput-object v1, v0, Lj0/v;->B:Lj0/q;

    .line 67
    .line 68
    :goto_0
    return-void
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
    .line 231
    .line 232
    .line 233
    .line 234
.end method

.method public final a0()V
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, Lj0/x;->P0:Lj0/v;

    .line 2
    .line 3
    iget-boolean v1, v0, Lj0/v;->S:Z

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Lj0/v;->o()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Lj0/v;->f()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0}, Lj0/v;->s()V

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    iput-boolean v1, v0, Lj0/v;->S:Z
    :try_end_0
    .catch Lj0/k; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    .line 25
    :cond_0
    return-void

    .line 26
    :catch_0
    move-exception v0

    .line 27
    iget-boolean v1, p0, Lq0/r;->r0:Z

    .line 28
    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    const/16 v1, 0x138b

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    const/16 v1, 0x138a

    .line 35
    .line 36
    :goto_0
    iget-object v2, v0, Lj0/k;->n:La0/p;

    .line 37
    .line 38
    iget-boolean v3, v0, Lj0/k;->m:Z

    .line 39
    .line 40
    invoke-virtual {p0, v0, v2, v3, v1}, Lh0/h;->i(Ljava/lang/Exception;La0/p;ZI)Lh0/o;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    throw v0
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
.end method

.method public final d()La0/J;
    .locals 1

    .line 1
    iget-object v0, p0, Lj0/x;->P0:Lj0/v;

    .line 2
    .line 3
    iget-object v0, v0, Lj0/v;->C:La0/J;

    .line 4
    .line 5
    return-object v0
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
.end method

.method public final f()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Lj0/x;->Z0:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput-boolean v1, p0, Lj0/x;->Z0:Z

    .line 5
    .line 6
    return v0
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
.end method

.method public final getMediaClock()Lh0/U;
    .locals 0

    .line 1
    return-object p0
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
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "MediaCodecAudioRenderer"

    .line 2
    .line 3
    return-object v0
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
.end method

.method public final h()J
    .locals 2

    .line 1
    iget v0, p0, Lh0/h;->s:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Lj0/x;->o0()V

    .line 7
    .line 8
    .line 9
    :cond_0
    iget-wide v0, p0, Lj0/x;->W0:J

    .line 10
    .line 11
    return-wide v0
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
.end method

.method public final h0(La0/p;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lh0/h;->o:Lh0/r0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget v0, v0, Lh0/r0;->a:I

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lj0/x;->m0(La0/p;)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    and-int/lit16 v2, v0, 0x200

    .line 16
    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    iget-object v2, p0, Lh0/h;->o:Lh0/r0;

    .line 20
    .line 21
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget v2, v2, Lh0/r0;->a:I

    .line 25
    .line 26
    const/4 v3, 0x2

    .line 27
    if-eq v2, v3, :cond_0

    .line 28
    .line 29
    and-int/lit16 v0, v0, 0x400

    .line 30
    .line 31
    if-nez v0, :cond_0

    .line 32
    .line 33
    iget v0, p1, La0/p;->F:I

    .line 34
    .line 35
    if-nez v0, :cond_1

    .line 36
    .line 37
    iget v0, p1, La0/p;->G:I

    .line 38
    .line 39
    if-nez v0, :cond_1

    .line 40
    .line 41
    :cond_0
    return v1

    .line 42
    :cond_1
    iget-object v0, p0, Lj0/x;->P0:Lj0/v;

    .line 43
    .line 44
    invoke-virtual {v0, p1}, Lj0/v;->i(La0/p;)I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-eqz p1, :cond_2

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    const/4 v1, 0x0

    .line 52
    :goto_0
    return v1
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

.method public final handleMessage(ILjava/lang/Object;)V
    .locals 8

    .line 1
    const/4 v0, 0x2

    .line 2
    iget-object v1, p0, Lj0/x;->P0:Lj0/v;

    .line 3
    .line 4
    if-eq p1, v0, :cond_15

    .line 5
    .line 6
    const/4 v0, 0x3

    .line 7
    if-eq p1, v0, :cond_11

    .line 8
    .line 9
    const/4 v0, 0x6

    .line 10
    if-eq p1, v0, :cond_e

    .line 11
    .line 12
    const/16 v0, 0xc

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    if-eq p1, v0, :cond_a

    .line 16
    .line 17
    const/16 v0, 0x10

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    const/16 v4, 0x23

    .line 21
    .line 22
    if-eq p1, v0, :cond_8

    .line 23
    .line 24
    const/16 v0, 0x9

    .line 25
    .line 26
    if-eq p1, v0, :cond_5

    .line 27
    .line 28
    const/16 v0, 0xa

    .line 29
    .line 30
    if-eq p1, v0, :cond_0

    .line 31
    .line 32
    const/16 v0, 0xb

    .line 33
    .line 34
    if-ne p1, v0, :cond_16

    .line 35
    .line 36
    check-cast p2, Lh0/H;

    .line 37
    .line 38
    iput-object p2, p0, Lq0/r;->Q:Lh0/H;

    .line 39
    .line 40
    goto/16 :goto_5

    .line 41
    .line 42
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    check-cast p2, Ljava/lang/Integer;

    .line 46
    .line 47
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    iget p2, v1, Lj0/v;->X:I

    .line 52
    .line 53
    if-eq p2, p1, :cond_2

    .line 54
    .line 55
    iput p1, v1, Lj0/v;->X:I

    .line 56
    .line 57
    if-eqz p1, :cond_1

    .line 58
    .line 59
    const/4 v3, 0x1

    .line 60
    :cond_1
    iput-boolean v3, v1, Lj0/v;->W:Z

    .line 61
    .line 62
    invoke-virtual {v1}, Lj0/v;->g()V

    .line 63
    .line 64
    .line 65
    :cond_2
    sget p2, Ld0/w;->a:I

    .line 66
    .line 67
    if-lt p2, v4, :cond_16

    .line 68
    .line 69
    iget-object p2, p0, Lj0/x;->Q0:LZ1/s;

    .line 70
    .line 71
    if-eqz p2, :cond_16

    .line 72
    .line 73
    iget-object v0, p2, LZ1/s;->o:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v0, Landroid/media/LoudnessCodecController;

    .line 76
    .line 77
    if-eqz v0, :cond_3

    .line 78
    .line 79
    invoke-static {v0}, Lio/flutter/embedding/android/E;->d(Landroid/media/LoudnessCodecController;)V

    .line 80
    .line 81
    .line 82
    iput-object v2, p2, LZ1/s;->o:Ljava/lang/Object;

    .line 83
    .line 84
    :cond_3
    new-instance v0, Lq0/i;

    .line 85
    .line 86
    invoke-direct {v0, p2}, Lq0/i;-><init>(LZ1/s;)V

    .line 87
    .line 88
    .line 89
    invoke-static {p1, v0}, Lio/flutter/embedding/android/E;->b(ILq0/i;)Landroid/media/LoudnessCodecController;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    iput-object p1, p2, LZ1/s;->o:Ljava/lang/Object;

    .line 94
    .line 95
    iget-object p2, p2, LZ1/s;->m:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast p2, Ljava/util/HashSet;

    .line 98
    .line 99
    invoke-virtual {p2}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 100
    .line 101
    .line 102
    move-result-object p2

    .line 103
    :cond_4
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-eqz v0, :cond_16

    .line 108
    .line 109
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    check-cast v0, Landroid/media/MediaCodec;

    .line 114
    .line 115
    invoke-static {p1, v0}, Lio/flutter/embedding/android/E;->h(Landroid/media/LoudnessCodecController;Landroid/media/MediaCodec;)Z

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    if-nez v0, :cond_4

    .line 120
    .line 121
    invoke-interface {p2}, Ljava/util/Iterator;->remove()V

    .line 122
    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_5
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    check-cast p2, Ljava/lang/Boolean;

    .line 129
    .line 130
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 131
    .line 132
    .line 133
    move-result p1

    .line 134
    iput-boolean p1, v1, Lj0/v;->D:Z

    .line 135
    .line 136
    invoke-virtual {v1}, Lj0/v;->x()Z

    .line 137
    .line 138
    .line 139
    move-result p1

    .line 140
    if-eqz p1, :cond_6

    .line 141
    .line 142
    sget-object p1, La0/J;->d:La0/J;

    .line 143
    .line 144
    :goto_1
    move-object v3, p1

    .line 145
    goto :goto_2

    .line 146
    :cond_6
    iget-object p1, v1, Lj0/v;->C:La0/J;

    .line 147
    .line 148
    goto :goto_1

    .line 149
    :goto_2
    new-instance p1, Lj0/q;

    .line 150
    .line 151
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    move-object v2, p1

    .line 162
    invoke-direct/range {v2 .. v7}, Lj0/q;-><init>(La0/J;JJ)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v1}, Lj0/v;->o()Z

    .line 166
    .line 167
    .line 168
    move-result p2

    .line 169
    if-eqz p2, :cond_7

    .line 170
    .line 171
    iput-object p1, v1, Lj0/v;->A:Lj0/q;

    .line 172
    .line 173
    goto/16 :goto_5

    .line 174
    .line 175
    :cond_7
    iput-object p1, v1, Lj0/v;->B:Lj0/q;

    .line 176
    .line 177
    goto/16 :goto_5

    .line 178
    .line 179
    :cond_8
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    check-cast p2, Ljava/lang/Integer;

    .line 183
    .line 184
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 185
    .line 186
    .line 187
    move-result p1

    .line 188
    iput p1, p0, Lj0/x;->a1:I

    .line 189
    .line 190
    iget-object p1, p0, Lq0/r;->V:Lq0/l;

    .line 191
    .line 192
    if-nez p1, :cond_9

    .line 193
    .line 194
    goto/16 :goto_5

    .line 195
    .line 196
    :cond_9
    sget p2, Ld0/w;->a:I

    .line 197
    .line 198
    if-lt p2, v4, :cond_16

    .line 199
    .line 200
    new-instance p2, Landroid/os/Bundle;

    .line 201
    .line 202
    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    .line 203
    .line 204
    .line 205
    iget v0, p0, Lj0/x;->a1:I

    .line 206
    .line 207
    neg-int v0, v0

    .line 208
    invoke-static {v3, v0}, Ljava/lang/Math;->max(II)I

    .line 209
    .line 210
    .line 211
    move-result v0

    .line 212
    const-string v1, "importance"

    .line 213
    .line 214
    invoke-virtual {p2, v1, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 215
    .line 216
    .line 217
    invoke-interface {p1, p2}, Lq0/l;->a(Landroid/os/Bundle;)V

    .line 218
    .line 219
    .line 220
    goto/16 :goto_5

    .line 221
    .line 222
    :cond_a
    sget p1, Ld0/w;->a:I

    .line 223
    .line 224
    const/16 v0, 0x17

    .line 225
    .line 226
    if-lt p1, v0, :cond_16

    .line 227
    .line 228
    check-cast p2, Landroid/media/AudioDeviceInfo;

    .line 229
    .line 230
    if-nez p2, :cond_b

    .line 231
    .line 232
    move-object p1, v2

    .line 233
    goto :goto_3

    .line 234
    :cond_b
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 235
    .line 236
    .line 237
    new-instance p1, Landroidx/lifecycle/E;

    .line 238
    .line 239
    const/16 v0, 0x9

    .line 240
    .line 241
    invoke-direct {p1, p2, v0}, Landroidx/lifecycle/E;-><init>(Ljava/lang/Object;I)V

    .line 242
    .line 243
    .line 244
    :goto_3
    iput-object p1, v1, Lj0/v;->Z:Landroidx/lifecycle/E;

    .line 245
    .line 246
    iget-object p1, v1, Lj0/v;->x:Lj0/d;

    .line 247
    .line 248
    if-eqz p1, :cond_c

    .line 249
    .line 250
    invoke-virtual {p1, p2}, Lj0/d;->b(Landroid/media/AudioDeviceInfo;)V

    .line 251
    .line 252
    .line 253
    :cond_c
    iget-object p1, v1, Lj0/v;->v:Landroid/media/AudioTrack;

    .line 254
    .line 255
    if-eqz p1, :cond_16

    .line 256
    .line 257
    iget-object p2, v1, Lj0/v;->Z:Landroidx/lifecycle/E;

    .line 258
    .line 259
    if-nez p2, :cond_d

    .line 260
    .line 261
    goto :goto_4

    .line 262
    :cond_d
    iget-object p2, p2, Landroidx/lifecycle/E;->m:Ljava/lang/Object;

    .line 263
    .line 264
    move-object v2, p2

    .line 265
    check-cast v2, Landroid/media/AudioDeviceInfo;

    .line 266
    .line 267
    :goto_4
    invoke-virtual {p1, v2}, Landroid/media/AudioTrack;->setPreferredDevice(Landroid/media/AudioDeviceInfo;)Z

    .line 268
    .line 269
    .line 270
    goto :goto_5

    .line 271
    :cond_e
    check-cast p2, La0/d;

    .line 272
    .line 273
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 274
    .line 275
    .line 276
    iget-object p1, v1, Lj0/v;->Y:La0/d;

    .line 277
    .line 278
    invoke-virtual {p1, p2}, La0/d;->equals(Ljava/lang/Object;)Z

    .line 279
    .line 280
    .line 281
    move-result p1

    .line 282
    if-eqz p1, :cond_f

    .line 283
    .line 284
    goto :goto_5

    .line 285
    :cond_f
    iget-object p1, v1, Lj0/v;->v:Landroid/media/AudioTrack;

    .line 286
    .line 287
    if-eqz p1, :cond_10

    .line 288
    .line 289
    iget-object p1, v1, Lj0/v;->Y:La0/d;

    .line 290
    .line 291
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 292
    .line 293
    .line 294
    :cond_10
    iput-object p2, v1, Lj0/v;->Y:La0/d;

    .line 295
    .line 296
    goto :goto_5

    .line 297
    :cond_11
    check-cast p2, La0/c;

    .line 298
    .line 299
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 300
    .line 301
    .line 302
    iget-object p1, v1, Lj0/v;->z:La0/c;

    .line 303
    .line 304
    invoke-virtual {p1, p2}, La0/c;->equals(Ljava/lang/Object;)Z

    .line 305
    .line 306
    .line 307
    move-result p1

    .line 308
    if-eqz p1, :cond_12

    .line 309
    .line 310
    goto :goto_5

    .line 311
    :cond_12
    iput-object p2, v1, Lj0/v;->z:La0/c;

    .line 312
    .line 313
    iget-boolean p1, v1, Lj0/v;->a0:Z

    .line 314
    .line 315
    if-eqz p1, :cond_13

    .line 316
    .line 317
    goto :goto_5

    .line 318
    :cond_13
    iget-object p1, v1, Lj0/v;->x:Lj0/d;

    .line 319
    .line 320
    if-eqz p1, :cond_14

    .line 321
    .line 322
    iput-object p2, p1, Lj0/d;->i:La0/c;

    .line 323
    .line 324
    iget-object v0, p1, Lj0/d;->a:Landroid/content/Context;

    .line 325
    .line 326
    iget-object v2, p1, Lj0/d;->h:Landroidx/lifecycle/E;

    .line 327
    .line 328
    invoke-static {v0, p2, v2}, Lj0/b;->b(Landroid/content/Context;La0/c;Landroidx/lifecycle/E;)Lj0/b;

    .line 329
    .line 330
    .line 331
    move-result-object p2

    .line 332
    invoke-virtual {p1, p2}, Lj0/d;->a(Lj0/b;)V

    .line 333
    .line 334
    .line 335
    :cond_14
    invoke-virtual {v1}, Lj0/v;->g()V

    .line 336
    .line 337
    .line 338
    goto :goto_5

    .line 339
    :cond_15
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 340
    .line 341
    .line 342
    check-cast p2, Ljava/lang/Float;

    .line 343
    .line 344
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    .line 345
    .line 346
    .line 347
    move-result p1

    .line 348
    iget p2, v1, Lj0/v;->O:F

    .line 349
    .line 350
    cmpl-float p2, p2, p1

    .line 351
    .line 352
    if-eqz p2, :cond_16

    .line 353
    .line 354
    iput p1, v1, Lj0/v;->O:F

    .line 355
    .line 356
    invoke-virtual {v1}, Lj0/v;->o()Z

    .line 357
    .line 358
    .line 359
    move-result p1

    .line 360
    if-eqz p1, :cond_16

    .line 361
    .line 362
    iget-object p1, v1, Lj0/v;->v:Landroid/media/AudioTrack;

    .line 363
    .line 364
    iget p2, v1, Lj0/v;->O:F

    .line 365
    .line 366
    invoke-virtual {p1, p2}, Landroid/media/AudioTrack;->setVolume(F)I

    .line 367
    .line 368
    .line 369
    :cond_16
    :goto_5
    return-void
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
.end method

.method public final i0(Lq0/j;La0/p;)I
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget-object v2, v1, La0/p;->n:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {v2}, La0/G;->i(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/4 v3, 0x0

    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    invoke-static {v3, v3, v3, v3}, Lh0/q0;->e(IIII)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    return v1

    .line 19
    :cond_0
    const/4 v2, 0x1

    .line 20
    iget v4, v1, La0/p;->L:I

    .line 21
    .line 22
    if-eqz v4, :cond_1

    .line 23
    .line 24
    move v5, v2

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    move v5, v3

    .line 27
    :goto_0
    const/4 v6, 0x2

    .line 28
    if-eqz v4, :cond_3

    .line 29
    .line 30
    if-ne v4, v6, :cond_2

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_2
    move v4, v3

    .line 34
    goto :goto_2

    .line 35
    :cond_3
    :goto_1
    move v4, v2

    .line 36
    :goto_2
    const/16 v7, 0x20

    .line 37
    .line 38
    const/4 v8, 0x0

    .line 39
    const-string v9, "audio/raw"

    .line 40
    .line 41
    const/16 v10, 0x8

    .line 42
    .line 43
    const/4 v11, 0x4

    .line 44
    iget-object v12, v0, Lj0/x;->P0:Lj0/v;

    .line 45
    .line 46
    if-eqz v4, :cond_6

    .line 47
    .line 48
    if-eqz v5, :cond_5

    .line 49
    .line 50
    invoke-static {v9, v3, v3}, Lq0/y;->e(Ljava/lang/String;ZZ)Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 55
    .line 56
    .line 57
    move-result v13

    .line 58
    if-eqz v13, :cond_4

    .line 59
    .line 60
    move-object v5, v8

    .line 61
    goto :goto_3

    .line 62
    :cond_4
    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    check-cast v5, Lq0/o;

    .line 67
    .line 68
    :goto_3
    if-eqz v5, :cond_6

    .line 69
    .line 70
    :cond_5
    invoke-virtual {v0, v1}, Lj0/x;->m0(La0/p;)I

    .line 71
    .line 72
    .line 73
    move-result v5

    .line 74
    invoke-virtual {v12, v1}, Lj0/v;->i(La0/p;)I

    .line 75
    .line 76
    .line 77
    move-result v13

    .line 78
    if-eqz v13, :cond_7

    .line 79
    .line 80
    invoke-static {v11, v10, v7, v5}, Lh0/q0;->e(IIII)I

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    return v1

    .line 85
    :cond_6
    move v5, v3

    .line 86
    :cond_7
    iget-object v13, v1, La0/p;->n:Ljava/lang/String;

    .line 87
    .line 88
    invoke-virtual {v9, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v14

    .line 92
    if-eqz v14, :cond_9

    .line 93
    .line 94
    invoke-virtual {v12, v1}, Lj0/v;->i(La0/p;)I

    .line 95
    .line 96
    .line 97
    move-result v14

    .line 98
    if-eqz v14, :cond_8

    .line 99
    .line 100
    goto :goto_4

    .line 101
    :cond_8
    invoke-static {v2, v3, v3, v3}, Lh0/q0;->e(IIII)I

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    return v1

    .line 106
    :cond_9
    :goto_4
    new-instance v14, La0/o;

    .line 107
    .line 108
    invoke-direct {v14}, La0/o;-><init>()V

    .line 109
    .line 110
    .line 111
    invoke-static {v9}, La0/G;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v15

    .line 115
    iput-object v15, v14, La0/o;->m:Ljava/lang/String;

    .line 116
    .line 117
    iget v15, v1, La0/p;->C:I

    .line 118
    .line 119
    iput v15, v14, La0/o;->B:I

    .line 120
    .line 121
    iget v15, v1, La0/p;->D:I

    .line 122
    .line 123
    iput v15, v14, La0/o;->C:I

    .line 124
    .line 125
    iput v6, v14, La0/o;->D:I

    .line 126
    .line 127
    new-instance v15, La0/p;

    .line 128
    .line 129
    invoke-direct {v15, v14}, La0/p;-><init>(La0/o;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v12, v15}, Lj0/v;->i(La0/p;)I

    .line 133
    .line 134
    .line 135
    move-result v14

    .line 136
    if-eqz v14, :cond_15

    .line 137
    .line 138
    if-nez v13, :cond_a

    .line 139
    .line 140
    sget-object v8, Lm2/b0;->p:Lm2/b0;

    .line 141
    .line 142
    goto :goto_6

    .line 143
    :cond_a
    invoke-virtual {v12, v1}, Lj0/v;->i(La0/p;)I

    .line 144
    .line 145
    .line 146
    move-result v12

    .line 147
    if-eqz v12, :cond_c

    .line 148
    .line 149
    invoke-static {v9, v3, v3}, Lq0/y;->e(Ljava/lang/String;ZZ)Ljava/util/List;

    .line 150
    .line 151
    .line 152
    move-result-object v9

    .line 153
    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    .line 154
    .line 155
    .line 156
    move-result v12

    .line 157
    if-eqz v12, :cond_b

    .line 158
    .line 159
    goto :goto_5

    .line 160
    :cond_b
    invoke-interface {v9, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v8

    .line 164
    check-cast v8, Lq0/o;

    .line 165
    .line 166
    :goto_5
    if-eqz v8, :cond_c

    .line 167
    .line 168
    invoke-static {v8}, Lm2/I;->u(Ljava/lang/Object;)Lm2/b0;

    .line 169
    .line 170
    .line 171
    move-result-object v8

    .line 172
    goto :goto_6

    .line 173
    :cond_c
    move-object/from16 v8, p1

    .line 174
    .line 175
    invoke-static {v8, v1, v3, v3}, Lq0/y;->g(Lq0/j;La0/p;ZZ)Lm2/b0;

    .line 176
    .line 177
    .line 178
    move-result-object v8

    .line 179
    :goto_6
    invoke-virtual {v8}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 180
    .line 181
    .line 182
    move-result v9

    .line 183
    if-eqz v9, :cond_d

    .line 184
    .line 185
    invoke-static {v2, v3, v3, v3}, Lh0/q0;->e(IIII)I

    .line 186
    .line 187
    .line 188
    move-result v1

    .line 189
    return v1

    .line 190
    :cond_d
    if-nez v4, :cond_e

    .line 191
    .line 192
    invoke-static {v6, v3, v3, v3}, Lh0/q0;->e(IIII)I

    .line 193
    .line 194
    .line 195
    move-result v1

    .line 196
    return v1

    .line 197
    :cond_e
    invoke-virtual {v8, v3}, Lm2/b0;->get(I)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v4

    .line 201
    check-cast v4, Lq0/o;

    .line 202
    .line 203
    invoke-virtual {v4, v1}, Lq0/o;->d(La0/p;)Z

    .line 204
    .line 205
    .line 206
    move-result v6

    .line 207
    if-nez v6, :cond_10

    .line 208
    .line 209
    move v9, v2

    .line 210
    :goto_7
    iget v12, v8, Lm2/b0;->o:I

    .line 211
    .line 212
    if-ge v9, v12, :cond_10

    .line 213
    .line 214
    invoke-virtual {v8, v9}, Lm2/b0;->get(I)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v12

    .line 218
    check-cast v12, Lq0/o;

    .line 219
    .line 220
    invoke-virtual {v12, v1}, Lq0/o;->d(La0/p;)Z

    .line 221
    .line 222
    .line 223
    move-result v13

    .line 224
    if-eqz v13, :cond_f

    .line 225
    .line 226
    move v4, v3

    .line 227
    goto :goto_8

    .line 228
    :cond_f
    add-int/lit8 v9, v9, 0x1

    .line 229
    .line 230
    goto :goto_7

    .line 231
    :cond_10
    move-object v12, v4

    .line 232
    move v4, v2

    .line 233
    move v2, v6

    .line 234
    :goto_8
    if-eqz v2, :cond_11

    .line 235
    .line 236
    goto :goto_9

    .line 237
    :cond_11
    const/4 v11, 0x3

    .line 238
    :goto_9
    if-eqz v2, :cond_12

    .line 239
    .line 240
    invoke-virtual {v12, v1}, Lq0/o;->e(La0/p;)Z

    .line 241
    .line 242
    .line 243
    move-result v1

    .line 244
    if-eqz v1, :cond_12

    .line 245
    .line 246
    const/16 v10, 0x10

    .line 247
    .line 248
    :cond_12
    iget-boolean v1, v12, Lq0/o;->g:Z

    .line 249
    .line 250
    if-eqz v1, :cond_13

    .line 251
    .line 252
    const/16 v1, 0x40

    .line 253
    .line 254
    goto :goto_a

    .line 255
    :cond_13
    move v1, v3

    .line 256
    :goto_a
    if-eqz v4, :cond_14

    .line 257
    .line 258
    const/16 v3, 0x80

    .line 259
    .line 260
    :cond_14
    or-int v2, v11, v10

    .line 261
    .line 262
    or-int/2addr v2, v7

    .line 263
    or-int/2addr v1, v2

    .line 264
    or-int/2addr v1, v3

    .line 265
    or-int/2addr v1, v5

    .line 266
    return v1

    .line 267
    :cond_15
    invoke-static {v2, v3, v3, v3}, Lh0/q0;->e(IIII)I

    .line 268
    .line 269
    .line 270
    move-result v1

    .line 271
    return v1
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
.end method

.method public final isEnded()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Lq0/r;->E0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lj0/x;->P0:Lj0/v;

    .line 6
    .line 7
    invoke-virtual {v0}, Lj0/v;->o()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    iget-boolean v1, v0, Lj0/v;->S:Z

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-virtual {v0}, Lj0/v;->m()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    :cond_0
    const/4 v0, 0x1

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const/4 v0, 0x0

    .line 26
    :goto_0
    return v0
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

.method public final isReady()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lj0/x;->P0:Lj0/v;

    .line 2
    .line 3
    invoke-virtual {v0}, Lj0/v;->m()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    invoke-super {p0}, Lq0/r;->isReady()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    goto :goto_1

    .line 18
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 19
    :goto_1
    return v0
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
.end method

.method public final j()V
    .locals 3

    .line 1
    iget-object v0, p0, Lj0/x;->O0:LZ1/c;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iput-boolean v1, p0, Lj0/x;->Y0:Z

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    iput-object v1, p0, Lj0/x;->U0:La0/p;

    .line 8
    .line 9
    :try_start_0
    iget-object v1, p0, Lj0/x;->P0:Lj0/v;

    .line 10
    .line 11
    invoke-virtual {v1}, Lj0/v;->g()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 12
    .line 13
    .line 14
    :try_start_1
    invoke-super {p0}, Lq0/r;->j()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Lq0/r;->I0:Lh0/i;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, LZ1/c;->d(Lh0/i;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :catchall_0
    move-exception v1

    .line 24
    iget-object v2, p0, Lq0/r;->I0:Lh0/i;

    .line 25
    .line 26
    invoke-virtual {v0, v2}, LZ1/c;->d(Lh0/i;)V

    .line 27
    .line 28
    .line 29
    throw v1

    .line 30
    :catchall_1
    move-exception v1

    .line 31
    :try_start_2
    invoke-super {p0}, Lq0/r;->j()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 32
    .line 33
    .line 34
    iget-object v2, p0, Lq0/r;->I0:Lh0/i;

    .line 35
    .line 36
    invoke-virtual {v0, v2}, LZ1/c;->d(Lh0/i;)V

    .line 37
    .line 38
    .line 39
    throw v1

    .line 40
    :catchall_2
    move-exception v1

    .line 41
    iget-object v2, p0, Lq0/r;->I0:Lh0/i;

    .line 42
    .line 43
    invoke-virtual {v0, v2}, LZ1/c;->d(Lh0/i;)V

    .line 44
    .line 45
    .line 46
    throw v1
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
.end method

.method public final k(ZZ)V
    .locals 3

    .line 1
    new-instance p1, Lh0/i;

    .line 2
    .line 3
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lq0/r;->I0:Lh0/i;

    .line 7
    .line 8
    iget-object p2, p0, Lj0/x;->O0:LZ1/c;

    .line 9
    .line 10
    iget-object v0, p2, LZ1/c;->l:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Landroid/os/Handler;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    new-instance v1, Lj0/f;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-direct {v1, p2, p1, v2}, Lj0/f;-><init>(LZ1/c;Ljava/lang/Object;I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 23
    .line 24
    .line 25
    :cond_0
    iget-object p1, p0, Lh0/h;->o:Lh0/r0;

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    iget-boolean p1, p1, Lh0/r0;->b:Z

    .line 31
    .line 32
    iget-object p2, p0, Lj0/x;->P0:Lj0/v;

    .line 33
    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    iget-boolean p1, p2, Lj0/v;->W:Z

    .line 37
    .line 38
    invoke-static {p1}, Ld0/m;->h(Z)V

    .line 39
    .line 40
    .line 41
    iget-boolean p1, p2, Lj0/v;->a0:Z

    .line 42
    .line 43
    if-nez p1, :cond_2

    .line 44
    .line 45
    const/4 p1, 0x1

    .line 46
    iput-boolean p1, p2, Lj0/v;->a0:Z

    .line 47
    .line 48
    invoke-virtual {p2}, Lj0/v;->g()V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    iget-boolean p1, p2, Lj0/v;->a0:Z

    .line 53
    .line 54
    if-eqz p1, :cond_2

    .line 55
    .line 56
    const/4 p1, 0x0

    .line 57
    iput-boolean p1, p2, Lj0/v;->a0:Z

    .line 58
    .line 59
    invoke-virtual {p2}, Lj0/v;->g()V

    .line 60
    .line 61
    .line 62
    :cond_2
    :goto_0
    iget-object p1, p0, Lh0/h;->q:Li0/j;

    .line 63
    .line 64
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    iput-object p1, p2, Lj0/v;->q:Li0/j;

    .line 68
    .line 69
    iget-object p1, p0, Lh0/h;->r:Ld0/r;

    .line 70
    .line 71
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    iget-object p2, p2, Lj0/v;->g:Lj0/n;

    .line 75
    .line 76
    iput-object p1, p2, Lj0/n;->I:Ld0/r;

    .line 77
    .line 78
    return-void
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
.end method

.method public final l(JZ)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lq0/r;->l(JZ)V

    .line 2
    .line 3
    .line 4
    iget-object p3, p0, Lj0/x;->P0:Lj0/v;

    .line 5
    .line 6
    invoke-virtual {p3}, Lj0/v;->g()V

    .line 7
    .line 8
    .line 9
    iput-wide p1, p0, Lj0/x;->W0:J

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    iput-boolean p1, p0, Lj0/x;->Z0:Z

    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    iput-boolean p1, p0, Lj0/x;->X0:Z

    .line 16
    .line 17
    return-void
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
.end method

.method public final m()V
    .locals 4

    .line 1
    iget-object v0, p0, Lj0/x;->P0:Lj0/v;

    .line 2
    .line 3
    iget-object v0, v0, Lj0/v;->x:Lj0/d;

    .line 4
    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    iget-boolean v1, v0, Lj0/d;->j:Z

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v1, 0x0

    .line 13
    iput-object v1, v0, Lj0/d;->g:Lj0/b;

    .line 14
    .line 15
    sget v1, Ld0/w;->a:I

    .line 16
    .line 17
    const/16 v2, 0x17

    .line 18
    .line 19
    iget-object v3, v0, Lj0/d;->a:Landroid/content/Context;

    .line 20
    .line 21
    if-lt v1, v2, :cond_1

    .line 22
    .line 23
    iget-object v1, v0, Lj0/d;->d:LS2/e;

    .line 24
    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    const-string v2, "audio"

    .line 28
    .line 29
    invoke-virtual {v3, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, Landroid/media/AudioManager;

    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2, v1}, Landroid/media/AudioManager;->unregisterAudioDeviceCallback(Landroid/media/AudioDeviceCallback;)V

    .line 39
    .line 40
    .line 41
    :cond_1
    iget-object v1, v0, Lj0/d;->e:LX1/d;

    .line 42
    .line 43
    invoke-virtual {v3, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 44
    .line 45
    .line 46
    iget-object v1, v0, Lj0/d;->f:Lj0/c;

    .line 47
    .line 48
    if-eqz v1, :cond_2

    .line 49
    .line 50
    iget-object v2, v1, Lj0/c;->a:Landroid/content/ContentResolver;

    .line 51
    .line 52
    invoke-virtual {v2, v1}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    .line 53
    .line 54
    .line 55
    :cond_2
    const/4 v1, 0x0

    .line 56
    iput-boolean v1, v0, Lj0/d;->j:Z

    .line 57
    .line 58
    :cond_3
    :goto_0
    sget v0, Ld0/w;->a:I

    .line 59
    .line 60
    const/16 v1, 0x23

    .line 61
    .line 62
    if-lt v0, v1, :cond_4

    .line 63
    .line 64
    iget-object v0, p0, Lj0/x;->Q0:LZ1/s;

    .line 65
    .line 66
    if-eqz v0, :cond_4

    .line 67
    .line 68
    iget-object v1, v0, LZ1/s;->m:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v1, Ljava/util/HashSet;

    .line 71
    .line 72
    invoke-virtual {v1}, Ljava/util/HashSet;->clear()V

    .line 73
    .line 74
    .line 75
    iget-object v0, v0, LZ1/s;->o:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v0, Landroid/media/LoudnessCodecController;

    .line 78
    .line 79
    if-eqz v0, :cond_4

    .line 80
    .line 81
    invoke-static {v0}, Lio/flutter/embedding/android/E;->d(Landroid/media/LoudnessCodecController;)V

    .line 82
    .line 83
    .line 84
    :cond_4
    return-void
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
.end method

.method public final m0(La0/p;)I
    .locals 1

    .line 1
    iget-object v0, p0, Lj0/x;->P0:Lj0/v;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lj0/v;->h(La0/p;)Lj0/e;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-boolean v0, p1, Lj0/e;->a:Z

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    return p1

    .line 13
    :cond_0
    iget-boolean v0, p1, Lj0/e;->b:Z

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    const/16 v0, 0x600

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const/16 v0, 0x200

    .line 21
    .line 22
    :goto_0
    iget-boolean p1, p1, Lj0/e;->c:Z

    .line 23
    .line 24
    if-eqz p1, :cond_2

    .line 25
    .line 26
    or-int/lit16 v0, v0, 0x800

    .line 27
    .line 28
    :cond_2
    return v0
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

.method public final n()V
    .locals 5

    .line 1
    iget-object v0, p0, Lj0/x;->P0:Lj0/v;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput-boolean v1, p0, Lj0/x;->Z0:Z

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    :try_start_0
    invoke-virtual {p0}, Lq0/r;->v()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lq0/r;->Z()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 11
    .line 12
    .line 13
    :try_start_1
    iget-object v3, p0, Lq0/r;->P:Landroidx/lifecycle/E;

    .line 14
    .line 15
    if-nez v3, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {v3, v2}, Landroidx/lifecycle/E;->I(Lm0/e;)V

    .line 19
    .line 20
    .line 21
    :goto_0
    iput-object v2, p0, Lq0/r;->P:Landroidx/lifecycle/E;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    .line 23
    iget-boolean v2, p0, Lj0/x;->Y0:Z

    .line 24
    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    iput-boolean v1, p0, Lj0/x;->Y0:Z

    .line 28
    .line 29
    invoke-virtual {v0}, Lj0/v;->u()V

    .line 30
    .line 31
    .line 32
    :cond_1
    return-void

    .line 33
    :catchall_0
    move-exception v2

    .line 34
    goto :goto_1

    .line 35
    :catchall_1
    move-exception v3

    .line 36
    :try_start_2
    iget-object v4, p0, Lq0/r;->P:Landroidx/lifecycle/E;

    .line 37
    .line 38
    if-eqz v4, :cond_2

    .line 39
    .line 40
    invoke-virtual {v4, v2}, Landroidx/lifecycle/E;->I(Lm0/e;)V

    .line 41
    .line 42
    .line 43
    :cond_2
    iput-object v2, p0, Lq0/r;->P:Landroidx/lifecycle/E;

    .line 44
    .line 45
    throw v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 46
    :goto_1
    iget-boolean v3, p0, Lj0/x;->Y0:Z

    .line 47
    .line 48
    if-eqz v3, :cond_3

    .line 49
    .line 50
    iput-boolean v1, p0, Lj0/x;->Y0:Z

    .line 51
    .line 52
    invoke-virtual {v0}, Lj0/v;->u()V

    .line 53
    .line 54
    .line 55
    :cond_3
    throw v2
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
.end method

.method public final n0(Lq0/o;La0/p;)I
    .locals 1

    .line 1
    const-string v0, "OMX.google.raw.decoder"

    .line 2
    .line 3
    iget-object p1, p1, Lq0/o;->a:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_1

    .line 10
    .line 11
    sget p1, Ld0/w;->a:I

    .line 12
    .line 13
    const/16 v0, 0x18

    .line 14
    .line 15
    if-ge p1, v0, :cond_1

    .line 16
    .line 17
    const/16 v0, 0x17

    .line 18
    .line 19
    if-ne p1, v0, :cond_0

    .line 20
    .line 21
    iget-object p1, p0, Lj0/x;->N0:Landroid/content/Context;

    .line 22
    .line 23
    invoke-static {p1}, Ld0/w;->K(Landroid/content/Context;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-nez p1, :cond_1

    .line 28
    .line 29
    :cond_0
    const/4 p1, -0x1

    .line 30
    return p1

    .line 31
    :cond_1
    iget p1, p2, La0/p;->o:I

    .line 32
    .line 33
    return p1
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
.end method

.method public final o()V
    .locals 1

    .line 1
    iget-object v0, p0, Lj0/x;->P0:Lj0/v;

    .line 2
    .line 3
    invoke-virtual {v0}, Lj0/v;->r()V

    .line 4
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
.end method

.method public final o0()V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p0}, Lj0/x;->isEnded()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    iget-object v2, v0, Lj0/x;->P0:Lj0/v;

    .line 8
    .line 9
    invoke-virtual {v2}, Lj0/v;->o()Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    const-wide/high16 v4, -0x8000000000000000L

    .line 14
    .line 15
    if-eqz v3, :cond_7

    .line 16
    .line 17
    iget-boolean v3, v2, Lj0/v;->M:Z

    .line 18
    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    goto/16 :goto_4

    .line 22
    .line 23
    :cond_0
    iget-object v3, v2, Lj0/v;->g:Lj0/n;

    .line 24
    .line 25
    invoke-virtual {v3, v1}, Lj0/n;->a(Z)J

    .line 26
    .line 27
    .line 28
    move-result-wide v6

    .line 29
    iget-object v1, v2, Lj0/v;->t:Lj0/p;

    .line 30
    .line 31
    invoke-virtual {v2}, Lj0/v;->k()J

    .line 32
    .line 33
    .line 34
    move-result-wide v8

    .line 35
    iget v1, v1, Lj0/p;->e:I

    .line 36
    .line 37
    invoke-static {v8, v9, v1}, Ld0/w;->S(JI)J

    .line 38
    .line 39
    .line 40
    move-result-wide v8

    .line 41
    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->min(JJ)J

    .line 42
    .line 43
    .line 44
    move-result-wide v6

    .line 45
    :goto_0
    iget-object v1, v2, Lj0/v;->h:Ljava/util/ArrayDeque;

    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-nez v3, :cond_1

    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->getFirst()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    check-cast v3, Lj0/q;

    .line 58
    .line 59
    iget-wide v8, v3, Lj0/q;->c:J

    .line 60
    .line 61
    cmp-long v3, v6, v8

    .line 62
    .line 63
    if-ltz v3, :cond_1

    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->remove()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    check-cast v1, Lj0/q;

    .line 70
    .line 71
    iput-object v1, v2, Lj0/v;->B:Lj0/q;

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_1
    iget-object v3, v2, Lj0/v;->B:Lj0/q;

    .line 75
    .line 76
    iget-wide v8, v3, Lj0/q;->c:J

    .line 77
    .line 78
    sub-long v10, v6, v8

    .line 79
    .line 80
    iget-object v3, v3, Lj0/q;->a:La0/J;

    .line 81
    .line 82
    iget v3, v3, La0/J;->a:F

    .line 83
    .line 84
    invoke-static {v10, v11, v3}, Ld0/w;->x(JF)J

    .line 85
    .line 86
    .line 87
    move-result-wide v6

    .line 88
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    iget-object v3, v2, Lj0/v;->b:LZ1/s;

    .line 93
    .line 94
    if-eqz v1, :cond_5

    .line 95
    .line 96
    iget-object v1, v3, LZ1/s;->o:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v1, Lb0/g;

    .line 99
    .line 100
    invoke-virtual {v1}, Lb0/g;->a()Z

    .line 101
    .line 102
    .line 103
    move-result v8

    .line 104
    if-eqz v8, :cond_4

    .line 105
    .line 106
    iget-wide v8, v1, Lb0/g;->o:J

    .line 107
    .line 108
    const-wide/16 v12, 0x400

    .line 109
    .line 110
    cmp-long v8, v8, v12

    .line 111
    .line 112
    if-ltz v8, :cond_3

    .line 113
    .line 114
    iget-wide v8, v1, Lb0/g;->n:J

    .line 115
    .line 116
    iget-object v12, v1, Lb0/g;->j:Lb0/f;

    .line 117
    .line 118
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    iget v13, v12, Lb0/f;->k:I

    .line 122
    .line 123
    iget v12, v12, Lb0/f;->b:I

    .line 124
    .line 125
    mul-int/2addr v13, v12

    .line 126
    mul-int/lit8 v13, v13, 0x2

    .line 127
    .line 128
    int-to-long v12, v13

    .line 129
    sub-long v12, v8, v12

    .line 130
    .line 131
    iget-object v8, v1, Lb0/g;->h:Lb0/b;

    .line 132
    .line 133
    iget v8, v8, Lb0/b;->a:I

    .line 134
    .line 135
    iget-object v9, v1, Lb0/g;->g:Lb0/b;

    .line 136
    .line 137
    iget v9, v9, Lb0/b;->a:I

    .line 138
    .line 139
    if-ne v8, v9, :cond_2

    .line 140
    .line 141
    iget-wide v14, v1, Lb0/g;->o:J

    .line 142
    .line 143
    sget-object v16, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 144
    .line 145
    invoke-static/range {v10 .. v16}, Ld0/w;->U(JJJLjava/math/RoundingMode;)J

    .line 146
    .line 147
    .line 148
    move-result-wide v8

    .line 149
    goto :goto_1

    .line 150
    :cond_2
    int-to-long v14, v8

    .line 151
    mul-long/2addr v12, v14

    .line 152
    iget-wide v14, v1, Lb0/g;->o:J

    .line 153
    .line 154
    int-to-long v8, v9

    .line 155
    mul-long/2addr v14, v8

    .line 156
    sget-object v16, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 157
    .line 158
    invoke-static/range {v10 .. v16}, Ld0/w;->U(JJJLjava/math/RoundingMode;)J

    .line 159
    .line 160
    .line 161
    move-result-wide v8

    .line 162
    :goto_1
    move-wide v10, v8

    .line 163
    goto :goto_2

    .line 164
    :cond_3
    iget v1, v1, Lb0/g;->c:F

    .line 165
    .line 166
    float-to-double v8, v1

    .line 167
    long-to-double v10, v10

    .line 168
    mul-double/2addr v8, v10

    .line 169
    double-to-long v8, v8

    .line 170
    goto :goto_1

    .line 171
    :cond_4
    :goto_2
    iget-object v1, v2, Lj0/v;->B:Lj0/q;

    .line 172
    .line 173
    iget-wide v8, v1, Lj0/q;->b:J

    .line 174
    .line 175
    add-long/2addr v8, v10

    .line 176
    sub-long/2addr v10, v6

    .line 177
    iput-wide v10, v1, Lj0/q;->d:J

    .line 178
    .line 179
    goto :goto_3

    .line 180
    :cond_5
    iget-object v1, v2, Lj0/v;->B:Lj0/q;

    .line 181
    .line 182
    iget-wide v8, v1, Lj0/q;->b:J

    .line 183
    .line 184
    add-long/2addr v8, v6

    .line 185
    iget-wide v6, v1, Lj0/q;->d:J

    .line 186
    .line 187
    add-long/2addr v8, v6

    .line 188
    :goto_3
    iget-object v1, v3, LZ1/s;->n:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast v1, Lj0/z;

    .line 191
    .line 192
    iget-wide v6, v1, Lj0/z;->q:J

    .line 193
    .line 194
    iget-object v1, v2, Lj0/v;->t:Lj0/p;

    .line 195
    .line 196
    iget v1, v1, Lj0/p;->e:I

    .line 197
    .line 198
    invoke-static {v6, v7, v1}, Ld0/w;->S(JI)J

    .line 199
    .line 200
    .line 201
    move-result-wide v10

    .line 202
    add-long/2addr v10, v8

    .line 203
    iget-wide v8, v2, Lj0/v;->g0:J

    .line 204
    .line 205
    cmp-long v1, v6, v8

    .line 206
    .line 207
    if-lez v1, :cond_8

    .line 208
    .line 209
    iget-object v1, v2, Lj0/v;->t:Lj0/p;

    .line 210
    .line 211
    sub-long v8, v6, v8

    .line 212
    .line 213
    iget v1, v1, Lj0/p;->e:I

    .line 214
    .line 215
    invoke-static {v8, v9, v1}, Ld0/w;->S(JI)J

    .line 216
    .line 217
    .line 218
    move-result-wide v8

    .line 219
    iput-wide v6, v2, Lj0/v;->g0:J

    .line 220
    .line 221
    iget-wide v6, v2, Lj0/v;->h0:J

    .line 222
    .line 223
    add-long/2addr v6, v8

    .line 224
    iput-wide v6, v2, Lj0/v;->h0:J

    .line 225
    .line 226
    iget-object v1, v2, Lj0/v;->i0:Landroid/os/Handler;

    .line 227
    .line 228
    if-nez v1, :cond_6

    .line 229
    .line 230
    new-instance v1, Landroid/os/Handler;

    .line 231
    .line 232
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 233
    .line 234
    .line 235
    move-result-object v3

    .line 236
    invoke-direct {v1, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 237
    .line 238
    .line 239
    iput-object v1, v2, Lj0/v;->i0:Landroid/os/Handler;

    .line 240
    .line 241
    :cond_6
    iget-object v1, v2, Lj0/v;->i0:Landroid/os/Handler;

    .line 242
    .line 243
    const/4 v3, 0x0

    .line 244
    invoke-virtual {v1, v3}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    iget-object v1, v2, Lj0/v;->i0:Landroid/os/Handler;

    .line 248
    .line 249
    new-instance v3, LA3/c;

    .line 250
    .line 251
    const/16 v6, 0x10

    .line 252
    .line 253
    invoke-direct {v3, v2, v6}, LA3/c;-><init>(Ljava/lang/Object;I)V

    .line 254
    .line 255
    .line 256
    const-wide/16 v6, 0x64

    .line 257
    .line 258
    invoke-virtual {v1, v3, v6, v7}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 259
    .line 260
    .line 261
    goto :goto_5

    .line 262
    :cond_7
    :goto_4
    move-wide v10, v4

    .line 263
    :cond_8
    :goto_5
    cmp-long v1, v10, v4

    .line 264
    .line 265
    if-eqz v1, :cond_a

    .line 266
    .line 267
    iget-boolean v1, v0, Lj0/x;->X0:Z

    .line 268
    .line 269
    if-eqz v1, :cond_9

    .line 270
    .line 271
    goto :goto_6

    .line 272
    :cond_9
    iget-wide v1, v0, Lj0/x;->W0:J

    .line 273
    .line 274
    invoke-static {v1, v2, v10, v11}, Ljava/lang/Math;->max(JJ)J

    .line 275
    .line 276
    .line 277
    move-result-wide v10

    .line 278
    :goto_6
    iput-wide v10, v0, Lj0/x;->W0:J

    .line 279
    .line 280
    const/4 v1, 0x0

    .line 281
    iput-boolean v1, v0, Lj0/x;->X0:Z

    .line 282
    .line 283
    :cond_a
    return-void
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
.end method

.method public final p()V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lj0/x;->o0()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iget-object v1, p0, Lj0/x;->P0:Lj0/v;

    .line 6
    .line 7
    iput-boolean v0, v1, Lj0/v;->V:Z

    .line 8
    .line 9
    invoke-virtual {v1}, Lj0/v;->o()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-object v0, v1, Lj0/v;->g:Lj0/n;

    .line 16
    .line 17
    invoke-virtual {v0}, Lj0/n;->d()V

    .line 18
    .line 19
    .line 20
    iget-wide v2, v0, Lj0/n;->x:J

    .line 21
    .line 22
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    cmp-long v2, v2, v4

    .line 28
    .line 29
    if-nez v2, :cond_0

    .line 30
    .line 31
    iget-object v0, v0, Lj0/n;->e:Lj0/m;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Lj0/m;->a()V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    invoke-virtual {v0}, Lj0/n;->b()J

    .line 41
    .line 42
    .line 43
    move-result-wide v2

    .line 44
    iput-wide v2, v0, Lj0/n;->z:J

    .line 45
    .line 46
    iget-object v0, v1, Lj0/v;->v:Landroid/media/AudioTrack;

    .line 47
    .line 48
    invoke-static {v0}, Lj0/v;->p(Landroid/media/AudioTrack;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-eqz v0, :cond_1

    .line 53
    .line 54
    :goto_0
    iget-object v0, v1, Lj0/v;->v:Landroid/media/AudioTrack;

    .line 55
    .line 56
    invoke-virtual {v0}, Landroid/media/AudioTrack;->pause()V

    .line 57
    .line 58
    .line 59
    :cond_1
    return-void
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
.end method

.method public final t(Lq0/o;La0/p;La0/p;)Lh0/j;
    .locals 10

    .line 1
    invoke-virtual {p1, p2, p3}, Lq0/o;->b(La0/p;La0/p;)Lh0/j;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lq0/r;->P:Landroidx/lifecycle/E;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, p3}, Lj0/x;->h0(La0/p;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v1, v2

    .line 19
    :goto_0
    iget v3, v0, Lh0/j;->e:I

    .line 20
    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    const v1, 0x8000

    .line 24
    .line 25
    .line 26
    or-int/2addr v3, v1

    .line 27
    :cond_1
    invoke-virtual {p0, p1, p3}, Lj0/x;->n0(Lq0/o;La0/p;)I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    iget v4, p0, Lj0/x;->R0:I

    .line 32
    .line 33
    if-le v1, v4, :cond_2

    .line 34
    .line 35
    or-int/lit8 v3, v3, 0x40

    .line 36
    .line 37
    :cond_2
    move v9, v3

    .line 38
    new-instance v1, Lh0/j;

    .line 39
    .line 40
    if-eqz v9, :cond_3

    .line 41
    .line 42
    :goto_1
    move v8, v2

    .line 43
    goto :goto_2

    .line 44
    :cond_3
    iget v2, v0, Lh0/j;->d:I

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :goto_2
    iget-object v5, p1, Lq0/o;->a:Ljava/lang/String;

    .line 48
    .line 49
    move-object v4, v1

    .line 50
    move-object v6, p2

    .line 51
    move-object v7, p3

    .line 52
    invoke-direct/range {v4 .. v9}, Lh0/j;-><init>(Ljava/lang/String;La0/p;La0/p;II)V

    .line 53
    .line 54
    .line 55
    return-object v1
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
