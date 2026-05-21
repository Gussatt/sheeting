package m2;

import android.R;
import android.content.Context;
import android.graphics.Matrix;
import android.os.Build;
import android.util.TypedValue;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: m2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1400c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Matrix f10457f = new Matrix();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FlutterRenderer f10458a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f10460c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10462e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f10461d = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final N f10459b = N.a();

    public C1400c(FlutterRenderer flutterRenderer, boolean z3) {
        this.f10458a = flutterRenderer;
        this.f10460c = z3;
    }

    public final void a(MotionEvent motionEvent, int i4, int i5, int i6, Matrix matrix, ByteBuffer byteBuffer) {
        b(motionEvent, i4, i5, i6, matrix, byteBuffer, null);
    }

    public final void b(MotionEvent motionEvent, int i4, int i5, int i6, Matrix matrix, ByteBuffer byteBuffer, Context context) {
        int i7;
        int i8;
        long buttonState;
        int iE;
        int i9;
        double min;
        double max;
        double d4;
        double d5;
        double dC;
        double dG;
        InputDevice.MotionRange motionRange;
        if (i5 == -1) {
            return;
        }
        int iM = m(motionEvent, i4);
        int iF = f(motionEvent.getToolType(i4));
        float[] fArr = {motionEvent.getX(i4), motionEvent.getY(i4)};
        matrix.mapPoints(fArr);
        if (iF == 1) {
            i8 = 0;
            i7 = 1;
            buttonState = motionEvent.getButtonState() & 31;
            if (buttonState == 0 && motionEvent.getSource() == 8194 && i5 == 4) {
                this.f10461d.put(Integer.valueOf(iM), fArr);
            }
        } else {
            i7 = 1;
            i8 = 0;
            buttonState = iF == 2 ? (motionEvent.getButtonState() >> 4) & 15 : 0L;
        }
        boolean zContainsKey = this.f10461d.containsKey(Integer.valueOf(iM));
        if (zContainsKey) {
            iE = e(i5);
            if (iE == -1) {
                return;
            }
        } else {
            iE = -1;
        }
        long jD = this.f10460c ? this.f10459b.c(motionEvent).d() : 0L;
        int i10 = motionEvent.getActionMasked() == 8 ? i7 : i8;
        int i11 = iE;
        long eventTime = motionEvent.getEventTime() * 1000;
        byteBuffer.putLong(jD);
        byteBuffer.putLong(eventTime);
        if (zContainsKey) {
            i9 = i11;
            byteBuffer.putLong(i9);
            byteBuffer.putLong(4L);
        } else {
            i9 = i11;
            byteBuffer.putLong(i5);
            byteBuffer.putLong(iF);
        }
        byteBuffer.putLong(i10);
        byteBuffer.putLong(iM);
        byteBuffer.putLong(0L);
        if (zContainsKey) {
            float[] fArr2 = (float[]) this.f10461d.get(Integer.valueOf(iM));
            byteBuffer.putDouble(fArr2[i8]);
            byteBuffer.putDouble(fArr2[i7]);
        } else {
            byteBuffer.putDouble(fArr[i8]);
            byteBuffer.putDouble(fArr[i7]);
        }
        byteBuffer.putDouble(0.0d);
        byteBuffer.putDouble(0.0d);
        byteBuffer.putLong(buttonState);
        byteBuffer.putLong(0L);
        byteBuffer.putLong(0L);
        byteBuffer.putDouble(motionEvent.getPressure(i4));
        if (motionEvent.getDevice() == null || (motionRange = motionEvent.getDevice().getMotionRange(2)) == null) {
            min = 0.0d;
            max = 1.0d;
        } else {
            min = motionRange.getMin();
            max = motionRange.getMax();
        }
        byteBuffer.putDouble(min);
        byteBuffer.putDouble(max);
        if (iF == 2) {
            byteBuffer.putDouble(motionEvent.getAxisValue(24, i4));
            d4 = 0.0d;
            byteBuffer.putDouble(0.0d);
        } else {
            d4 = 0.0d;
            byteBuffer.putDouble(0.0d);
            byteBuffer.putDouble(0.0d);
        }
        byteBuffer.putDouble(motionEvent.getSize(i4));
        byteBuffer.putDouble(motionEvent.getToolMajor(i4));
        byteBuffer.putDouble(motionEvent.getToolMinor(i4));
        byteBuffer.putDouble(d4);
        byteBuffer.putDouble(d4);
        byteBuffer.putDouble(motionEvent.getAxisValue(8, i4));
        if (iF == 2) {
            byteBuffer.putDouble(motionEvent.getAxisValue(25, i4));
        } else {
            byteBuffer.putDouble(d4);
        }
        byteBuffer.putLong(i6);
        if (i10 == i7) {
            if (context != null) {
                dC = c(context);
                dG = g(context);
            } else {
                dC = 48.0d;
                dG = 48.0d;
            }
            double d6 = dC * ((double) (-motionEvent.getAxisValue(10, i4)));
            double d7 = dG * ((double) (-motionEvent.getAxisValue(9, i4)));
            byteBuffer.putDouble(d6);
            byteBuffer.putDouble(d7);
        } else {
            byteBuffer.putDouble(0.0d);
            byteBuffer.putDouble(0.0d);
        }
        if (zContainsKey) {
            float[] fArr3 = (float[]) this.f10461d.get(Integer.valueOf(iM));
            byteBuffer.putDouble(fArr[i8] - fArr3[i8]);
            byteBuffer.putDouble(fArr[1] - fArr3[1]);
            d5 = 0.0d;
        } else {
            d5 = 0.0d;
            byteBuffer.putDouble(0.0d);
            byteBuffer.putDouble(0.0d);
        }
        byteBuffer.putDouble(d5);
        byteBuffer.putDouble(d5);
        byteBuffer.putDouble(1.0d);
        byteBuffer.putDouble(d5);
        byteBuffer.putLong(0L);
        if (zContainsKey && i9 == 9) {
            this.f10461d.remove(Integer.valueOf(iM));
        }
    }

    public final float c(Context context) {
        return Build.VERSION.SDK_INT >= 26 ? ViewConfiguration.get(context).getScaledHorizontalScrollFactor() : i(context);
    }

    public final int d(int i4) {
        if (i4 == 0) {
            return 4;
        }
        if (i4 == 1) {
            return 6;
        }
        if (i4 == 5) {
            return 4;
        }
        if (i4 == 6) {
            return 6;
        }
        if (i4 == 2) {
            return 5;
        }
        if (i4 == 7) {
            return 3;
        }
        if (i4 == 3) {
            return 0;
        }
        return i4 == 8 ? 3 : -1;
    }

    public final int e(int i4) {
        if (i4 == 4) {
            return 7;
        }
        if (i4 == 5) {
            return 8;
        }
        return (i4 == 6 || i4 == 0) ? 9 : -1;
    }

    public final int f(int i4) {
        if (i4 == 1) {
            return 0;
        }
        if (i4 == 2) {
            return 2;
        }
        if (i4 != 3) {
            return i4 != 4 ? 5 : 3;
        }
        return 1;
    }

    public final float g(Context context) {
        return Build.VERSION.SDK_INT >= 26 ? h(context) : i(context);
    }

    public final float h(Context context) {
        return ViewConfiguration.get(context).getScaledVerticalScrollFactor();
    }

    public final int i(Context context) {
        if (this.f10462e == 0) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                return 48;
            }
            this.f10462e = (int) typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f10462e;
    }

    public boolean j(MotionEvent motionEvent, Context context) {
        boolean zIsFromSource = motionEvent.isFromSource(2);
        boolean z3 = motionEvent.getActionMasked() == 7 || motionEvent.getActionMasked() == 8;
        if (!zIsFromSource || !z3) {
            return false;
        }
        int iD = d(motionEvent.getActionMasked());
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(motionEvent.getPointerCount() * 288);
        byteBufferAllocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        b(motionEvent, motionEvent.getActionIndex(), iD, 0, f10457f, byteBufferAllocateDirect, context);
        if (byteBufferAllocateDirect.position() % 288 != 0) {
            throw new AssertionError("Packet position is not on field boundary.");
        }
        this.f10458a.l(byteBufferAllocateDirect, byteBufferAllocateDirect.position());
        return true;
    }

    public boolean k(MotionEvent motionEvent) {
        return l(motionEvent, f10457f);
    }

    public boolean l(MotionEvent motionEvent, Matrix matrix) {
        int actionMasked = motionEvent.getActionMasked();
        int iD = d(motionEvent.getActionMasked());
        boolean z3 = actionMasked == 0 || actionMasked == 5;
        boolean z4 = !z3 && (actionMasked == 1 || actionMasked == 6);
        int i4 = (z4 && f(motionEvent.getToolType(motionEvent.getActionIndex())) == 0) ? 1 : 0;
        int pointerCount = motionEvent.getPointerCount();
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect((pointerCount + i4) * 288);
        byteBufferAllocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        if (z3) {
            a(motionEvent, motionEvent.getActionIndex(), iD, 0, matrix, byteBufferAllocateDirect);
        } else if (z4) {
            for (int i5 = 0; i5 < pointerCount; i5++) {
                if (i5 != motionEvent.getActionIndex() && motionEvent.getToolType(i5) == 1) {
                    a(motionEvent, i5, 5, 1, matrix, byteBufferAllocateDirect);
                }
            }
            a(motionEvent, motionEvent.getActionIndex(), iD, 0, matrix, byteBufferAllocateDirect);
            if (i4 != 0) {
                a(motionEvent, motionEvent.getActionIndex(), 2, 0, matrix, byteBufferAllocateDirect);
            }
        } else {
            for (int i6 = 0; i6 < pointerCount; i6++) {
                a(motionEvent, i6, iD, 0, matrix, byteBufferAllocateDirect);
            }
        }
        if (byteBufferAllocateDirect.position() % 288 != 0) {
            throw new AssertionError("Packet position is not on field boundary");
        }
        this.f10458a.l(byteBufferAllocateDirect, byteBufferAllocateDirect.position());
        return true;
    }

    public final int m(MotionEvent motionEvent, int i4) {
        return (motionEvent.getToolType(i4) & 7) | (motionEvent.getPointerId(i4) << 3);
    }
}
