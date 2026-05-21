package w2;

import java.nio.ByteBuffer;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: renamed from: w2.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1612e implements InterfaceC1615h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1612e f11877a = new C1612e();

    @Override // w2.InterfaceC1615h
    public ByteBuffer a(Object obj) {
        if (obj == null) {
            return null;
        }
        Object objA = AbstractC1614g.a(obj);
        return objA instanceof String ? C1623p.f11897b.a(JSONObject.quote((String) objA)) : C1623p.f11897b.a(objA.toString());
    }

    @Override // w2.InterfaceC1615h
    public Object b(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        try {
            JSONTokener jSONTokener = new JSONTokener(C1623p.f11897b.b(byteBuffer));
            Object objNextValue = jSONTokener.nextValue();
            if (jSONTokener.more()) {
                throw new IllegalArgumentException("Invalid JSON");
            }
            return objNextValue;
        } catch (JSONException e4) {
            throw new IllegalArgumentException("Invalid JSON", e4);
        }
    }
}
