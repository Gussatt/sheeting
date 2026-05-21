package P;

import K2.p;
import L2.u;
import O.f;
import O.g;
import O.h;
import P.f;
import X2.l;
import androidx.datastore.preferences.protobuf.AbstractC0584f;
import androidx.datastore.preferences.protobuf.AbstractC0597t;
import java.util.List;
import java.util.Map;
import java.util.Set;
import t3.InterfaceC1547c;
import t3.InterfaceC1548d;

/* JADX INFO: loaded from: classes.dex */
public final class j implements N.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f2890a = new j();

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2891a;

        static {
            int[] iArr = new int[h.b.values().length];
            try {
                iArr[h.b.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h.b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h.b.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[h.b.INTEGER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[h.b.LONG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[h.b.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[h.b.STRING_SET.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[h.b.BYTES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[h.b.VALUE_NOT_SET.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f2891a = iArr;
        }
    }

    @Override // N.c
    public Object b(InterfaceC1548d interfaceC1548d, N2.e eVar) throws L.c {
        O.f fVarA = O.d.f2833a.a(interfaceC1548d.P());
        c cVarB = g.b(new f.b[0]);
        Map mapR = fVarA.R();
        l.d(mapR, "preferencesProto.preferencesMap");
        for (Map.Entry entry : mapR.entrySet()) {
            String str = (String) entry.getKey();
            O.h hVar = (O.h) entry.getValue();
            j jVar = f2890a;
            l.d(str, "name");
            l.d(hVar, "value");
            jVar.d(str, hVar, cVarB);
        }
        return cVarB.d();
    }

    public final void d(String str, O.h hVar, c cVar) throws L.c {
        h.b bVarG0 = hVar.g0();
        switch (bVarG0 == null ? -1 : a.f2891a[bVarG0.ordinal()]) {
            case -1:
                throw new L.c("Value case is null.", null, 2, null);
            case 0:
            default:
                throw new K2.h();
            case 1:
                cVar.j(h.a(str), Boolean.valueOf(hVar.X()));
                return;
            case 2:
                cVar.j(h.d(str), Float.valueOf(hVar.b0()));
                return;
            case 3:
                cVar.j(h.c(str), Double.valueOf(hVar.a0()));
                return;
            case O.h.LONG_FIELD_NUMBER /* 4 */:
                cVar.j(h.e(str), Integer.valueOf(hVar.c0()));
                return;
            case O.h.STRING_FIELD_NUMBER /* 5 */:
                cVar.j(h.f(str), Long.valueOf(hVar.d0()));
                return;
            case O.h.STRING_SET_FIELD_NUMBER /* 6 */:
                f.a aVarG = h.g(str);
                String strE0 = hVar.e0();
                l.d(strE0, "value.string");
                cVar.j(aVarG, strE0);
                return;
            case O.h.DOUBLE_FIELD_NUMBER /* 7 */:
                f.a aVarH = h.h(str);
                List listT = hVar.f0().T();
                l.d(listT, "value.stringSet.stringsList");
                cVar.j(aVarH, u.I(listT));
                return;
            case O.h.BYTES_FIELD_NUMBER /* 8 */:
                f.a aVarB = h.b(str);
                byte[] bArrW = hVar.Y().w();
                l.d(bArrW, "value.bytes.toByteArray()");
                cVar.j(aVarB, bArrW);
                return;
            case 9:
                throw new L.c("Value not set.", null, 2, null);
        }
    }

    @Override // N.c
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public f a() {
        return g.a();
    }

    public final O.h f(Object obj) {
        if (obj instanceof Boolean) {
            AbstractC0597t abstractC0597tL = O.h.h0().t(((Boolean) obj).booleanValue()).l();
            l.d(abstractC0597tL, "newBuilder().setBoolean(value).build()");
            return (O.h) abstractC0597tL;
        }
        if (obj instanceof Float) {
            AbstractC0597t abstractC0597tL2 = O.h.h0().w(((Number) obj).floatValue()).l();
            l.d(abstractC0597tL2, "newBuilder().setFloat(value).build()");
            return (O.h) abstractC0597tL2;
        }
        if (obj instanceof Double) {
            AbstractC0597t abstractC0597tL3 = O.h.h0().v(((Number) obj).doubleValue()).l();
            l.d(abstractC0597tL3, "newBuilder().setDouble(value).build()");
            return (O.h) abstractC0597tL3;
        }
        if (obj instanceof Integer) {
            AbstractC0597t abstractC0597tL4 = O.h.h0().x(((Number) obj).intValue()).l();
            l.d(abstractC0597tL4, "newBuilder().setInteger(value).build()");
            return (O.h) abstractC0597tL4;
        }
        if (obj instanceof Long) {
            AbstractC0597t abstractC0597tL5 = O.h.h0().y(((Number) obj).longValue()).l();
            l.d(abstractC0597tL5, "newBuilder().setLong(value).build()");
            return (O.h) abstractC0597tL5;
        }
        if (obj instanceof String) {
            AbstractC0597t abstractC0597tL6 = O.h.h0().z((String) obj).l();
            l.d(abstractC0597tL6, "newBuilder().setString(value).build()");
            return (O.h) abstractC0597tL6;
        }
        if (obj instanceof Set) {
            h.a aVarH0 = O.h.h0();
            g.a aVarU = O.g.U();
            l.c(obj, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
            AbstractC0597t abstractC0597tL7 = aVarH0.A(aVarU.t((Set) obj)).l();
            l.d(abstractC0597tL7, "newBuilder().setStringSe…                ).build()");
            return (O.h) abstractC0597tL7;
        }
        if (obj instanceof byte[]) {
            AbstractC0597t abstractC0597tL8 = O.h.h0().u(AbstractC0584f.i((byte[]) obj)).l();
            l.d(abstractC0597tL8, "newBuilder().setBytes(By….copyFrom(value)).build()");
            return (O.h) abstractC0597tL8;
        }
        throw new IllegalStateException("PreferencesSerializer does not support type: " + obj.getClass().getName());
    }

    @Override // N.c
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Object c(f fVar, InterfaceC1547c interfaceC1547c, N2.e eVar) {
        Map mapA = fVar.a();
        f.a aVarU = O.f.U();
        for (Map.Entry entry : mapA.entrySet()) {
            aVarU.t(((f.a) entry.getKey()).a(), f(entry.getValue()));
        }
        ((O.f) aVarU.l()).i(interfaceC1547c.N());
        return p.f2516a;
    }
}
