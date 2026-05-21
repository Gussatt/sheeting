package V2;

import X2.d;
import X2.l;
import X2.z;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final Class a(d3.b bVar) {
        l.e(bVar, "<this>");
        Class clsD = ((d) bVar).d();
        l.c(clsD, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return clsD;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class b(d3.b bVar) {
        l.e(bVar, "<this>");
        Class clsD = ((d) bVar).d();
        if (!clsD.isPrimitive()) {
            l.c(clsD, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return clsD;
        }
        String name = clsD.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    clsD = Double.class;
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    clsD = Integer.class;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    clsD = Byte.class;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    clsD = Character.class;
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    clsD = Long.class;
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    clsD = Void.class;
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    clsD = Boolean.class;
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    clsD = Float.class;
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    clsD = Short.class;
                }
                break;
        }
        l.c(clsD, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return clsD;
    }

    public static final d3.b c(Class cls) {
        l.e(cls, "<this>");
        return z.b(cls);
    }
}
