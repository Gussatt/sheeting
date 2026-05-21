package androidx.core.graphics.drawable;

import O.h;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f4579k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f4581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f4582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Parcelable f4583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4584e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4585f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f4586g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f4587h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f4588i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f4589j;

    public static class a {
        public static int a(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e4) {
                Log.e("IconCompat", "Unable to get icon resource", e4);
                return 0;
            } catch (NoSuchMethodException e5) {
                Log.e("IconCompat", "Unable to get icon resource", e5);
                return 0;
            } catch (InvocationTargetException e6) {
                Log.e("IconCompat", "Unable to get icon resource", e6);
                return 0;
            }
        }

        public static String b(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e4) {
                Log.e("IconCompat", "Unable to get icon package", e4);
                return null;
            } catch (NoSuchMethodException e5) {
                Log.e("IconCompat", "Unable to get icon package", e5);
                return null;
            } catch (InvocationTargetException e6) {
                Log.e("IconCompat", "Unable to get icon package", e6);
                return null;
            }
        }

        public static int c(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e4) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e4);
                return -1;
            } catch (NoSuchMethodException e5) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e5);
                return -1;
            } catch (InvocationTargetException e6) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e6);
                return -1;
            }
        }

        public static Uri d(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e4) {
                Log.e("IconCompat", "Unable to get icon uri", e4);
                return null;
            } catch (NoSuchMethodException e5) {
                Log.e("IconCompat", "Unable to get icon uri", e5);
                return null;
            } catch (InvocationTargetException e6) {
                Log.e("IconCompat", "Unable to get icon uri", e6);
                return null;
            }
        }

        public static Drawable e(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        public static Icon f(IconCompat iconCompat, Context context) {
            Icon iconCreateWithBitmap;
            switch (iconCompat.f4580a) {
                case -1:
                    return (Icon) iconCompat.f4581b;
                case 0:
                default:
                    throw new IllegalArgumentException("Unknown type");
                case 1:
                    iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f4581b);
                    break;
                case 2:
                    iconCreateWithBitmap = Icon.createWithResource(iconCompat.d(), iconCompat.f4584e);
                    break;
                case 3:
                    iconCreateWithBitmap = Icon.createWithData((byte[]) iconCompat.f4581b, iconCompat.f4584e, iconCompat.f4585f);
                    break;
                case h.LONG_FIELD_NUMBER /* 4 */:
                    iconCreateWithBitmap = Icon.createWithContentUri((String) iconCompat.f4581b);
                    break;
                case h.STRING_FIELD_NUMBER /* 5 */:
                    iconCreateWithBitmap = Build.VERSION.SDK_INT < 26 ? Icon.createWithBitmap(IconCompat.a((Bitmap) iconCompat.f4581b, false)) : b.b((Bitmap) iconCompat.f4581b);
                    break;
                case h.STRING_SET_FIELD_NUMBER /* 6 */:
                    int i4 = Build.VERSION.SDK_INT;
                    if (i4 >= 30) {
                        iconCreateWithBitmap = d.a(iconCompat.f());
                    } else {
                        if (context == null) {
                            throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.f());
                        }
                        InputStream inputStreamG = iconCompat.g(context);
                        if (inputStreamG == null) {
                            throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.f());
                        }
                        if (i4 < 26) {
                            iconCreateWithBitmap = Icon.createWithBitmap(IconCompat.a(BitmapFactory.decodeStream(inputStreamG), false));
                        } else {
                            iconCreateWithBitmap = b.b(BitmapFactory.decodeStream(inputStreamG));
                        }
                    }
                    break;
            }
            ColorStateList colorStateList = iconCompat.f4586g;
            if (colorStateList != null) {
                iconCreateWithBitmap.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f4587h;
            if (mode != IconCompat.f4579k) {
                iconCreateWithBitmap.setTintMode(mode);
            }
            return iconCreateWithBitmap;
        }
    }

    public static class b {
        public static Drawable a(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        public static Icon b(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    public static class c {
        public static int a(Object obj) {
            return ((Icon) obj).getResId();
        }

        public static String b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        public static int c(Object obj) {
            return ((Icon) obj).getType();
        }

        public static Uri d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    public static class d {
        public static Icon a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    public IconCompat() {
        this.f4580a = -1;
        this.f4582c = null;
        this.f4583d = null;
        this.f4584e = 0;
        this.f4585f = 0;
        this.f4586g = null;
        this.f4587h = f4579k;
        this.f4588i = null;
    }

    public static Bitmap a(Bitmap bitmap, boolean z3) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f4 = iMin;
        float f5 = 0.5f * f4;
        float f6 = 0.9166667f * f5;
        if (z3) {
            float f7 = 0.010416667f * f4;
            paint.setColor(0);
            paint.setShadowLayer(f7, 0.0f, f4 * 0.020833334f, 1023410176);
            canvas.drawCircle(f5, f5, f6, paint);
            paint.setShadowLayer(f7, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f5, f5, f6, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f5, f5, f6, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    public static IconCompat b(Resources resources, String str, int i4) {
        B.c.c(str);
        if (i4 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f4584e = i4;
        if (resources != null) {
            try {
                iconCompat.f4581b = resources.getResourceName(i4);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f4581b = str;
        }
        iconCompat.f4589j = str;
        return iconCompat;
    }

    public static String l(int i4) {
        switch (i4) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case h.LONG_FIELD_NUMBER /* 4 */:
                return "URI";
            case h.STRING_FIELD_NUMBER /* 5 */:
                return "BITMAP_MASKABLE";
            case h.STRING_SET_FIELD_NUMBER /* 6 */:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    public int c() {
        int i4 = this.f4580a;
        if (i4 == -1) {
            return a.a(this.f4581b);
        }
        if (i4 == 2) {
            return this.f4584e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public String d() {
        int i4 = this.f4580a;
        if (i4 == -1) {
            return a.b(this.f4581b);
        }
        if (i4 == 2) {
            String str = this.f4589j;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f4581b).split(":", -1)[0] : this.f4589j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public int e() {
        int i4 = this.f4580a;
        return i4 == -1 ? a.c(this.f4581b) : i4;
    }

    public Uri f() {
        int i4 = this.f4580a;
        if (i4 == -1) {
            return a.d(this.f4581b);
        }
        if (i4 == 4 || i4 == 6) {
            return Uri.parse((String) this.f4581b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public InputStream g(Context context) {
        Uri uriF = f();
        String scheme = uriF.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(uriF);
            } catch (Exception e4) {
                Log.w("IconCompat", "Unable to load image from URI: " + uriF, e4);
                return null;
            }
        }
        try {
            return new FileInputStream(new File((String) this.f4581b));
        } catch (FileNotFoundException e5) {
            Log.w("IconCompat", "Unable to load image from path: " + uriF, e5);
            return null;
        }
    }

    public void h() {
        this.f4587h = PorterDuff.Mode.valueOf(this.f4588i);
        switch (this.f4580a) {
            case -1:
                Parcelable parcelable = this.f4583d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                this.f4581b = parcelable;
                return;
            case 0:
            default:
                return;
            case 1:
            case h.STRING_FIELD_NUMBER /* 5 */:
                Parcelable parcelable2 = this.f4583d;
                if (parcelable2 != null) {
                    this.f4581b = parcelable2;
                    return;
                }
                byte[] bArr = this.f4582c;
                this.f4581b = bArr;
                this.f4580a = 3;
                this.f4584e = 0;
                this.f4585f = bArr.length;
                return;
            case 2:
            case h.LONG_FIELD_NUMBER /* 4 */:
            case h.STRING_SET_FIELD_NUMBER /* 6 */:
                String str = new String(this.f4582c, Charset.forName("UTF-16"));
                this.f4581b = str;
                if (this.f4580a == 2 && this.f4589j == null) {
                    this.f4589j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f4581b = this.f4582c;
                return;
        }
    }

    public void i(boolean z3) {
        this.f4588i = this.f4587h.name();
        switch (this.f4580a) {
            case -1:
                if (z3) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                this.f4583d = (Parcelable) this.f4581b;
                return;
            case 0:
            default:
                return;
            case 1:
            case h.STRING_FIELD_NUMBER /* 5 */:
                if (!z3) {
                    this.f4583d = (Parcelable) this.f4581b;
                    return;
                }
                Bitmap bitmap = (Bitmap) this.f4581b;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                this.f4582c = byteArrayOutputStream.toByteArray();
                return;
            case 2:
                this.f4582c = ((String) this.f4581b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f4582c = (byte[]) this.f4581b;
                return;
            case h.LONG_FIELD_NUMBER /* 4 */:
            case h.STRING_SET_FIELD_NUMBER /* 6 */:
                this.f4582c = this.f4581b.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
    }

    public Icon j() {
        return k(null);
    }

    public Icon k(Context context) {
        return a.f(this, context);
    }

    public String toString() {
        if (this.f4580a == -1) {
            return String.valueOf(this.f4581b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(l(this.f4580a));
        switch (this.f4580a) {
            case 1:
            case h.STRING_FIELD_NUMBER /* 5 */:
                sb.append(" size=");
                sb.append(((Bitmap) this.f4581b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f4581b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f4589j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(c())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f4584e);
                if (this.f4585f != 0) {
                    sb.append(" off=");
                    sb.append(this.f4585f);
                }
                break;
            case h.LONG_FIELD_NUMBER /* 4 */:
            case h.STRING_SET_FIELD_NUMBER /* 6 */:
                sb.append(" uri=");
                sb.append(this.f4581b);
                break;
        }
        if (this.f4586g != null) {
            sb.append(" tint=");
            sb.append(this.f4586g);
        }
        if (this.f4587h != f4579k) {
            sb.append(" mode=");
            sb.append(this.f4587h);
        }
        sb.append(")");
        return sb.toString();
    }

    public IconCompat(int i4) {
        this.f4582c = null;
        this.f4583d = null;
        this.f4584e = 0;
        this.f4585f = 0;
        this.f4586g = null;
        this.f4587h = f4579k;
        this.f4588i = null;
        this.f4580a = i4;
    }
}
