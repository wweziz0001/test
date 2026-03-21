package io.flutter.embedding.engine.mutatorsstack;

import a0.C0200z;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import g.InterfaceC0434a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC0434a
public class FlutterMutatorsStack {
    private List<C0200z> mutators = new ArrayList();
    private Matrix finalMatrix = new Matrix();
    private List<Path> finalClippingPaths = new ArrayList();
    private float finalOpacity = 1.0f;

    public List<Path> getFinalClippingPaths() {
        return this.finalClippingPaths;
    }

    public Matrix getFinalMatrix() {
        return this.finalMatrix;
    }

    public float getFinalOpacity() {
        return this.finalOpacity;
    }

    public List<C0200z> getMutators() {
        return this.mutators;
    }

    public void pushClipPath(Path path) {
        this.mutators.add(new C0200z(17));
        path.transform(this.finalMatrix);
        this.finalClippingPaths.add(path);
    }

    public void pushClipRRect(int i, int i5, int i6, int i7, float[] fArr) {
        Rect rect = new Rect(i, i5, i6, i7);
        this.mutators.add(new C0200z(17));
        Path path = new Path();
        path.addRoundRect(new RectF(rect), fArr, Path.Direction.CCW);
        path.transform(this.finalMatrix);
        this.finalClippingPaths.add(path);
    }

    public void pushClipRect(int i, int i5, int i6, int i7) {
        Rect rect = new Rect(i, i5, i6, i7);
        this.mutators.add(new C0200z(17));
        Path path = new Path();
        path.addRect(new RectF(rect), Path.Direction.CCW);
        path.transform(this.finalMatrix);
        this.finalClippingPaths.add(path);
    }

    public void pushOpacity(float f2) {
        this.mutators.add(new C0200z(17));
        this.finalOpacity *= f2;
    }

    public void pushTransform(float[] fArr) {
        Matrix matrix = new Matrix();
        matrix.setValues(fArr);
        this.mutators.add(new C0200z(17));
        this.finalMatrix.preConcat(matrix);
    }
}
