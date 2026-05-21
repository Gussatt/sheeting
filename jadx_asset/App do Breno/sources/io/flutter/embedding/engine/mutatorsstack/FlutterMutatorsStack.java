package io.flutter.embedding.engine.mutatorsstack;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class FlutterMutatorsStack {
    private List<a> mutators = new ArrayList();
    private Matrix finalMatrix = new Matrix();
    private List<Path> finalClippingPaths = new ArrayList();
    private float finalOpacity = 1.0f;

    public enum b {
        CLIP_RECT,
        CLIP_RRECT,
        CLIP_PATH,
        TRANSFORM,
        OPACITY
    }

    public List<Path> getFinalClippingPaths() {
        return this.finalClippingPaths;
    }

    public Matrix getFinalMatrix() {
        return this.finalMatrix;
    }

    public float getFinalOpacity() {
        return this.finalOpacity;
    }

    public List<a> getMutators() {
        return this.mutators;
    }

    public void pushClipPath(Path path) {
        this.mutators.add(new a(path));
        path.transform(this.finalMatrix);
        this.finalClippingPaths.add(path);
    }

    public void pushClipRRect(int i4, int i5, int i6, int i7, float[] fArr) {
        Rect rect = new Rect(i4, i5, i6, i7);
        this.mutators.add(new a(rect, fArr));
        Path path = new Path();
        path.addRoundRect(new RectF(rect), fArr, Path.Direction.CCW);
        path.transform(this.finalMatrix);
        this.finalClippingPaths.add(path);
    }

    public void pushClipRect(int i4, int i5, int i6, int i7) {
        Rect rect = new Rect(i4, i5, i6, i7);
        this.mutators.add(new a(rect));
        Path path = new Path();
        path.addRect(new RectF(rect), Path.Direction.CCW);
        path.transform(this.finalMatrix);
        this.finalClippingPaths.add(path);
    }

    public void pushOpacity(float f4) {
        this.mutators.add(new a(f4));
        this.finalOpacity *= f4;
    }

    public void pushTransform(float[] fArr) {
        Matrix matrix = new Matrix();
        matrix.setValues(fArr);
        a aVar = new a(matrix);
        this.mutators.add(aVar);
        this.finalMatrix.preConcat(aVar.a());
    }

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Matrix f7787a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Rect f7788b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Path f7789c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float[] f7790d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f7791e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public b f7792f;

        public a(Rect rect) {
            this.f7791e = 1.0f;
            this.f7792f = b.CLIP_RECT;
            this.f7788b = rect;
        }

        public Matrix a() {
            return this.f7787a;
        }

        public a(Rect rect, float[] fArr) {
            this.f7791e = 1.0f;
            this.f7792f = b.CLIP_RRECT;
            this.f7788b = rect;
            this.f7790d = fArr;
        }

        public a(Path path) {
            this.f7791e = 1.0f;
            this.f7792f = b.CLIP_PATH;
            this.f7789c = path;
        }

        public a(Matrix matrix) {
            this.f7791e = 1.0f;
            this.f7792f = b.TRANSFORM;
            this.f7787a = matrix;
        }

        public a(float f4) {
            this.f7791e = 1.0f;
            this.f7792f = b.OPACITY;
            this.f7791e = f4;
        }
    }
}
