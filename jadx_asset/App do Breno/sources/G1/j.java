package G1;

import F1.C0268a;
import F1.F;
import android.util.Base64;
import android.util.JsonReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final O1.a f1646a = new Q1.d().j(C0268a.f1076a).k(true).i();

    public interface a {
        Object a(JsonReader jsonReader);
    }

    public static F.e.d.f A(JsonReader jsonReader) throws IOException {
        F.e.d.f.a aVarA = F.e.d.f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("assignments")) {
                aVarA.b(n(jsonReader, new a() { // from class: G1.f
                    @Override // G1.j.a
                    public final Object a(JsonReader jsonReader2) {
                        return j.z(jsonReader2);
                    }
                }));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    public static F.e.d.a.b.AbstractC0023d B(JsonReader jsonReader) throws IOException {
        F.e.d.a.b.AbstractC0023d.AbstractC0024a abstractC0024aA = F.e.d.a.b.AbstractC0023d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "address":
                    abstractC0024aA.b(jsonReader.nextLong());
                    break;
                case "code":
                    abstractC0024aA.c(jsonReader.nextString());
                    break;
                case "name":
                    abstractC0024aA.d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0024aA.a();
    }

    public static F.e.d.a.b.AbstractC0025e C(JsonReader jsonReader) throws IOException {
        F.e.d.a.b.AbstractC0025e.AbstractC0026a abstractC0026aA = F.e.d.a.b.AbstractC0025e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "frames":
                    abstractC0026aA.b(n(jsonReader, new i()));
                    break;
                case "name":
                    abstractC0026aA.d(jsonReader.nextString());
                    break;
                case "importance":
                    abstractC0026aA.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0026aA.a();
    }

    public static F.d.b D(JsonReader jsonReader) throws IOException {
        F.d.b.a aVarA = F.d.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("filename")) {
                aVarA.c(jsonReader.nextString());
            } else if (strNextName.equals("contents")) {
                aVarA.b(Base64.decode(jsonReader.nextString(), 2));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    public static F.d E(JsonReader jsonReader) throws IOException {
        F.d.a aVarA = F.d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("files")) {
                aVarA.b(n(jsonReader, new a() { // from class: G1.e
                    @Override // G1.j.a
                    public final Object a(JsonReader jsonReader2) {
                        return j.D(jsonReader2);
                    }
                }));
            } else if (strNextName.equals("orgId")) {
                aVarA.c(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    public static F.e.AbstractC0032e F(JsonReader jsonReader) throws IOException {
        F.e.AbstractC0032e.a aVarA = F.e.AbstractC0032e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "buildVersion":
                    aVarA.b(jsonReader.nextString());
                    break;
                case "jailbroken":
                    aVarA.c(jsonReader.nextBoolean());
                    break;
                case "version":
                    aVarA.e(jsonReader.nextString());
                    break;
                case "platform":
                    aVarA.d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    public static F.e.d.a.c G(JsonReader jsonReader) throws IOException {
        F.e.d.a.c.AbstractC0029a abstractC0029aA = F.e.d.a.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "pid":
                    abstractC0029aA.d(jsonReader.nextInt());
                    break;
                case "processName":
                    abstractC0029aA.e(jsonReader.nextString());
                    break;
                case "defaultProcess":
                    abstractC0029aA.b(jsonReader.nextBoolean());
                    break;
                case "importance":
                    abstractC0029aA.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0029aA.a();
    }

    public static F H(JsonReader jsonReader) throws IOException {
        F.b bVarB = F.b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "ndkPayload":
                    bVarB.j(E(jsonReader));
                    break;
                case "sdkVersion":
                    bVarB.l(jsonReader.nextString());
                    break;
                case "appQualitySessionId":
                    bVarB.c(jsonReader.nextString());
                    break;
                case "appExitInfo":
                    bVarB.b(m(jsonReader));
                    break;
                case "buildVersion":
                    bVarB.d(jsonReader.nextString());
                    break;
                case "firebaseAuthenticationToken":
                    bVarB.f(jsonReader.nextString());
                    break;
                case "gmpAppId":
                    bVarB.h(jsonReader.nextString());
                    break;
                case "installationUuid":
                    bVarB.i(jsonReader.nextString());
                    break;
                case "firebaseInstallationId":
                    bVarB.g(jsonReader.nextString());
                    break;
                case "platform":
                    bVarB.k(jsonReader.nextInt());
                    break;
                case "displayVersion":
                    bVarB.e(jsonReader.nextString());
                    break;
                case "session":
                    bVarB.m(J(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bVarB.a();
    }

    public static F.e.d.AbstractC0031e.b I(JsonReader jsonReader) throws IOException {
        F.e.d.AbstractC0031e.b.a aVarA = F.e.d.AbstractC0031e.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("variantId")) {
                aVarA.c(jsonReader.nextString());
            } else if (strNextName.equals("rolloutId")) {
                aVarA.b(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    public static F.e J(JsonReader jsonReader) throws IOException {
        F.e.b bVarA = F.e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "startedAt":
                    bVarA.m(jsonReader.nextLong());
                    break;
                case "appQualitySessionId":
                    bVarA.c(jsonReader.nextString());
                    break;
                case "identifier":
                    bVarA.k(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case "endedAt":
                    bVarA.f(Long.valueOf(jsonReader.nextLong()));
                    break;
                case "device":
                    bVarA.e(q(jsonReader));
                    break;
                case "events":
                    bVarA.g(n(jsonReader, new a() { // from class: G1.d
                        @Override // G1.j.a
                        public final Object a(JsonReader jsonReader2) {
                            return j.r(jsonReader2);
                        }
                    }));
                    break;
                case "os":
                    bVarA.l(F(jsonReader));
                    break;
                case "app":
                    bVarA.b(l(jsonReader));
                    break;
                case "user":
                    bVarA.n(K(jsonReader));
                    break;
                case "generator":
                    bVarA.h(jsonReader.nextString());
                    break;
                case "crashed":
                    bVarA.d(jsonReader.nextBoolean());
                    break;
                case "generatorType":
                    bVarA.i(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bVarA.a();
    }

    public static F.e.f K(JsonReader jsonReader) throws IOException {
        F.e.f.a aVarA = F.e.f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.nextName().equals("identifier")) {
                aVarA.b(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    public static F.e.a l(JsonReader jsonReader) throws IOException {
        F.e.a.AbstractC0017a abstractC0017aA = F.e.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "identifier":
                    abstractC0017aA.e(jsonReader.nextString());
                    break;
                case "developmentPlatform":
                    abstractC0017aA.b(jsonReader.nextString());
                    break;
                case "developmentPlatformVersion":
                    abstractC0017aA.c(jsonReader.nextString());
                    break;
                case "version":
                    abstractC0017aA.g(jsonReader.nextString());
                    break;
                case "installationUuid":
                    abstractC0017aA.f(jsonReader.nextString());
                    break;
                case "displayVersion":
                    abstractC0017aA.d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0017aA.a();
    }

    public static F.a m(JsonReader jsonReader) throws IOException {
        F.a.b bVarA = F.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "buildIdMappingForArch":
                    bVarA.b(n(jsonReader, new a() { // from class: G1.a
                        @Override // G1.j.a
                        public final Object a(JsonReader jsonReader2) {
                            return j.o(jsonReader2);
                        }
                    }));
                    break;
                case "pid":
                    bVarA.d(jsonReader.nextInt());
                    break;
                case "pss":
                    bVarA.f(jsonReader.nextLong());
                    break;
                case "rss":
                    bVarA.h(jsonReader.nextLong());
                    break;
                case "timestamp":
                    bVarA.i(jsonReader.nextLong());
                    break;
                case "processName":
                    bVarA.e(jsonReader.nextString());
                    break;
                case "reasonCode":
                    bVarA.g(jsonReader.nextInt());
                    break;
                case "traceFile":
                    bVarA.j(jsonReader.nextString());
                    break;
                case "importance":
                    bVarA.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bVarA.a();
    }

    public static List n(JsonReader jsonReader, a aVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(aVar.a(jsonReader));
        }
        jsonReader.endArray();
        return Collections.unmodifiableList(arrayList);
    }

    public static F.a.AbstractC0015a o(JsonReader jsonReader) throws IOException {
        F.a.AbstractC0015a.AbstractC0016a abstractC0016aA = F.a.AbstractC0015a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "libraryName":
                    abstractC0016aA.d(jsonReader.nextString());
                    break;
                case "arch":
                    abstractC0016aA.b(jsonReader.nextString());
                    break;
                case "buildId":
                    abstractC0016aA.c(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0016aA.a();
    }

    public static F.c p(JsonReader jsonReader) throws IOException {
        F.c.a aVarA = F.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("key")) {
                aVarA.b(jsonReader.nextString());
            } else if (strNextName.equals("value")) {
                aVarA.c(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    public static F.e.c q(JsonReader jsonReader) throws IOException {
        F.e.c.a aVarA = F.e.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "simulator":
                    aVarA.i(jsonReader.nextBoolean());
                    break;
                case "manufacturer":
                    aVarA.e(jsonReader.nextString());
                    break;
                case "ram":
                    aVarA.h(jsonReader.nextLong());
                    break;
                case "arch":
                    aVarA.b(jsonReader.nextInt());
                    break;
                case "diskSpace":
                    aVarA.d(jsonReader.nextLong());
                    break;
                case "cores":
                    aVarA.c(jsonReader.nextInt());
                    break;
                case "model":
                    aVarA.f(jsonReader.nextString());
                    break;
                case "state":
                    aVarA.j(jsonReader.nextInt());
                    break;
                case "modelClass":
                    aVarA.g(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    public static F.e.d r(JsonReader jsonReader) throws IOException {
        F.e.d.b bVarA = F.e.d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "device":
                    bVarA.c(u(jsonReader));
                    break;
                case "rollouts":
                    bVarA.e(A(jsonReader));
                    break;
                case "app":
                    bVarA.b(s(jsonReader));
                    break;
                case "log":
                    bVarA.d(y(jsonReader));
                    break;
                case "type":
                    bVarA.g(jsonReader.nextString());
                    break;
                case "timestamp":
                    bVarA.f(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bVarA.a();
    }

    public static F.e.d.a s(JsonReader jsonReader) throws IOException {
        F.e.d.a.AbstractC0018a abstractC0018aA = F.e.d.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "appProcessDetails":
                    abstractC0018aA.b(n(jsonReader, new a() { // from class: G1.c
                        @Override // G1.j.a
                        public final Object a(JsonReader jsonReader2) {
                            return j.G(jsonReader2);
                        }
                    }));
                    break;
                case "background":
                    abstractC0018aA.c(Boolean.valueOf(jsonReader.nextBoolean()));
                    break;
                case "execution":
                    abstractC0018aA.f(v(jsonReader));
                    break;
                case "internalKeys":
                    abstractC0018aA.g(n(jsonReader, new a() { // from class: G1.b
                        @Override // G1.j.a
                        public final Object a(JsonReader jsonReader2) {
                            return j.p(jsonReader2);
                        }
                    }));
                    break;
                case "customAttributes":
                    abstractC0018aA.e(n(jsonReader, new a() { // from class: G1.b
                        @Override // G1.j.a
                        public final Object a(JsonReader jsonReader2) {
                            return j.p(jsonReader2);
                        }
                    }));
                    break;
                case "uiOrientation":
                    abstractC0018aA.h(jsonReader.nextInt());
                    break;
                case "currentProcessDetails":
                    abstractC0018aA.d(G(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0018aA.a();
    }

    public static F.e.d.a.b.AbstractC0019a t(JsonReader jsonReader) throws IOException {
        F.e.d.a.b.AbstractC0019a.AbstractC0020a abstractC0020aA = F.e.d.a.b.AbstractC0019a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "name":
                    abstractC0020aA.c(jsonReader.nextString());
                    break;
                case "size":
                    abstractC0020aA.d(jsonReader.nextLong());
                    break;
                case "uuid":
                    abstractC0020aA.f(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case "baseAddress":
                    abstractC0020aA.b(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0020aA.a();
    }

    public static F.e.d.c u(JsonReader jsonReader) throws IOException {
        F.e.d.c.a aVarA = F.e.d.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "batteryLevel":
                    aVarA.b(Double.valueOf(jsonReader.nextDouble()));
                    break;
                case "batteryVelocity":
                    aVarA.c(jsonReader.nextInt());
                    break;
                case "orientation":
                    aVarA.e(jsonReader.nextInt());
                    break;
                case "diskUsed":
                    aVarA.d(jsonReader.nextLong());
                    break;
                case "ramUsed":
                    aVarA.g(jsonReader.nextLong());
                    break;
                case "proximityOn":
                    aVarA.f(jsonReader.nextBoolean());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    public static F.e.d.a.b v(JsonReader jsonReader) throws IOException {
        F.e.d.a.b.AbstractC0021b abstractC0021bA = F.e.d.a.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "appExitInfo":
                    abstractC0021bA.b(m(jsonReader));
                    break;
                case "threads":
                    abstractC0021bA.f(n(jsonReader, new a() { // from class: G1.g
                        @Override // G1.j.a
                        public final Object a(JsonReader jsonReader2) {
                            return j.C(jsonReader2);
                        }
                    }));
                    break;
                case "signal":
                    abstractC0021bA.e(B(jsonReader));
                    break;
                case "binaries":
                    abstractC0021bA.c(n(jsonReader, new a() { // from class: G1.h
                        @Override // G1.j.a
                        public final Object a(JsonReader jsonReader2) {
                            return j.t(jsonReader2);
                        }
                    }));
                    break;
                case "exception":
                    abstractC0021bA.d(w(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0021bA.a();
    }

    public static F.e.d.a.b.c w(JsonReader jsonReader) throws IOException {
        F.e.d.a.b.c.AbstractC0022a abstractC0022aA = F.e.d.a.b.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "frames":
                    abstractC0022aA.c(n(jsonReader, new i()));
                    break;
                case "reason":
                    abstractC0022aA.e(jsonReader.nextString());
                    break;
                case "type":
                    abstractC0022aA.f(jsonReader.nextString());
                    break;
                case "causedBy":
                    abstractC0022aA.b(w(jsonReader));
                    break;
                case "overflowCount":
                    abstractC0022aA.d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0022aA.a();
    }

    public static F.e.d.a.b.AbstractC0025e.AbstractC0027b x(JsonReader jsonReader) throws IOException {
        F.e.d.a.b.AbstractC0025e.AbstractC0027b.AbstractC0028a abstractC0028aA = F.e.d.a.b.AbstractC0025e.AbstractC0027b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "offset":
                    abstractC0028aA.d(jsonReader.nextLong());
                    break;
                case "symbol":
                    abstractC0028aA.f(jsonReader.nextString());
                    break;
                case "pc":
                    abstractC0028aA.e(jsonReader.nextLong());
                    break;
                case "file":
                    abstractC0028aA.b(jsonReader.nextString());
                    break;
                case "importance":
                    abstractC0028aA.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0028aA.a();
    }

    public static F.e.d.AbstractC0030d y(JsonReader jsonReader) throws IOException {
        F.e.d.AbstractC0030d.a aVarA = F.e.d.AbstractC0030d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.nextName().equals("content")) {
                aVarA.b(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    public static F.e.d.AbstractC0031e z(JsonReader jsonReader) throws IOException {
        F.e.d.AbstractC0031e.a aVarA = F.e.d.AbstractC0031e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "parameterKey":
                    aVarA.b(jsonReader.nextString());
                    break;
                case "templateVersion":
                    aVarA.e(jsonReader.nextLong());
                    break;
                case "rolloutVariant":
                    aVarA.d(I(jsonReader));
                    break;
                case "parameterValue":
                    aVarA.c(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    public F L(String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                F fH = H(jsonReader);
                jsonReader.close();
                return fH;
            } finally {
            }
        } catch (IllegalStateException e4) {
            throw new IOException(e4);
        }
    }

    public String M(F f4) {
        return f1646a.a(f4);
    }

    public F.e.d j(String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                F.e.d dVarR = r(jsonReader);
                jsonReader.close();
                return dVarR;
            } finally {
            }
        } catch (IllegalStateException e4) {
            throw new IOException(e4);
        }
    }

    public String k(F.e.d dVar) {
        return f1646a.a(dVar);
    }
}
