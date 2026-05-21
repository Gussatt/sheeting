package m2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.view.Surface;
import android.view.View;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import java.nio.ByteBuffer;
import java.util.Locale;
import l2.AbstractC1388b;

/* JADX INFO: loaded from: classes.dex */
public class r extends View implements io.flutter.embedding.engine.renderer.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageReader f10490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Image f10491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Bitmap f10492d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public FlutterRenderer f10493e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f10494f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f10495g;

    public enum a {
        background,
        overlay
    }

    public r(Context context, int i4, int i5, a aVar) {
        this(context, h(i4, i5), aVar);
    }

    public static ImageReader h(int i4, int i5) {
        int i6;
        int i7;
        if (i4 <= 0) {
            j("ImageReader width must be greater than 0, but given width=%d, set width=1", Integer.valueOf(i4));
            i6 = 1;
        } else {
            i6 = i4;
        }
        if (i5 <= 0) {
            j("ImageReader height must be greater than 0, but given height=%d, set height=1", Integer.valueOf(i5));
            i7 = 1;
        } else {
            i7 = i5;
        }
        return Build.VERSION.SDK_INT >= 29 ? ImageReader.newInstance(i6, i7, 1, 3, 768L) : ImageReader.newInstance(i6, i7, 1, 3);
    }

    public static void j(String str, Object... objArr) {
        AbstractC1388b.g("FlutterImageView", String.format(Locale.US, str, objArr));
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public void a() {
        if (this.f10495g) {
            setAlpha(0.0f);
            e();
            this.f10492d = null;
            f();
            invalidate();
            this.f10495g = false;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public void c(FlutterRenderer flutterRenderer) {
        if (this.f10494f.ordinal() == 0) {
            flutterRenderer.C(this.f10490b.getSurface());
        }
        setAlpha(1.0f);
        this.f10493e = flutterRenderer;
        this.f10495g = true;
    }

    public boolean e() {
        if (!this.f10495g) {
            return false;
        }
        Image imageAcquireLatestImage = this.f10490b.acquireLatestImage();
        if (imageAcquireLatestImage != null) {
            f();
            this.f10491c = imageAcquireLatestImage;
            invalidate();
        }
        return imageAcquireLatestImage != null;
    }

    public final void f() {
        Image image = this.f10491c;
        if (image != null) {
            image.close();
            this.f10491c = null;
        }
    }

    public void g() {
        this.f10490b.close();
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public FlutterRenderer getAttachedRenderer() {
        return this.f10493e;
    }

    public ImageReader getImageReader() {
        return this.f10490b;
    }

    public Surface getSurface() {
        return this.f10490b.getSurface();
    }

    public final void i() {
        setAlpha(0.0f);
    }

    public void k(int i4, int i5) {
        if (this.f10493e == null) {
            return;
        }
        if (i4 == this.f10490b.getWidth() && i5 == this.f10490b.getHeight()) {
            return;
        }
        f();
        g();
        this.f10490b = h(i4, i5);
    }

    public final void l() {
        if (Build.VERSION.SDK_INT >= 29) {
            HardwareBuffer hardwareBuffer = this.f10491c.getHardwareBuffer();
            this.f10492d = Bitmap.wrapHardwareBuffer(hardwareBuffer, ColorSpace.get(ColorSpace.Named.SRGB));
            hardwareBuffer.close();
            return;
        }
        Image.Plane[] planes = this.f10491c.getPlanes();
        if (planes.length != 1) {
            return;
        }
        Image.Plane plane = planes[0];
        int rowStride = plane.getRowStride() / plane.getPixelStride();
        int height = this.f10491c.getHeight();
        Bitmap bitmap = this.f10492d;
        if (bitmap == null || bitmap.getWidth() != rowStride || this.f10492d.getHeight() != height) {
            this.f10492d = Bitmap.createBitmap(rowStride, height, Bitmap.Config.ARGB_8888);
        }
        ByteBuffer buffer = plane.getBuffer();
        buffer.rewind();
        this.f10492d.copyPixelsFromBuffer(buffer);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f10491c != null) {
            l();
        }
        Bitmap bitmap = this.f10492d;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i4, int i5, int i6, int i7) {
        if (!(i4 == this.f10490b.getWidth() && i5 == this.f10490b.getHeight()) && this.f10494f == a.background && this.f10495g) {
            k(i4, i5);
            this.f10493e.C(this.f10490b.getSurface());
        }
    }

    public r(Context context, ImageReader imageReader, a aVar) {
        super(context, null);
        this.f10495g = false;
        this.f10490b = imageReader;
        this.f10494f = aVar;
        i();
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public void b() {
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public void d() {
    }
}
