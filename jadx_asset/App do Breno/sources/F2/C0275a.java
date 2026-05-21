package F2;

import F2.AbstractC0277c;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import s2.InterfaceC1536a;
import w2.InterfaceC1609b;

/* JADX INFO: renamed from: F2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0275a implements InterfaceC1536a, AbstractC0277c.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SharedPreferences f1622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final G f1623d;

    /* JADX INFO: renamed from: F2.a$a, reason: collision with other inner class name */
    public static class C0046a implements G {
        @Override // F2.G
        public String a(List list) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                objectOutputStream.writeObject(list);
                objectOutputStream.flush();
                return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
            } catch (IOException e4) {
                throw new RuntimeException(e4);
            }
        }

        @Override // F2.G
        public List b(String str) {
            try {
                return (List) new L(new ByteArrayInputStream(Base64.decode(str, 0))).readObject();
            } catch (IOException | ClassNotFoundException e4) {
                throw new RuntimeException(e4);
            }
        }
    }

    public C0275a() {
        this(new C0046a());
    }

    private void x(InterfaceC1609b interfaceC1609b, Context context) {
        this.f1622c = context.getSharedPreferences("FlutterSharedPreferences", 0);
        try {
            AbstractC0277c.b.p(interfaceC1609b, this);
        } catch (Exception e4) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesPlugin", e4);
        }
    }

    @Override // s2.InterfaceC1536a
    public void c(InterfaceC1536a.b bVar) {
        x(bVar.b(), bVar.a());
    }

    @Override // F2.AbstractC0277c.b
    public Boolean d(String str, Long l4) {
        return Boolean.valueOf(this.f1622c.edit().putLong(str, l4.longValue()).commit());
    }

    @Override // F2.AbstractC0277c.b
    public Map e(String str, List list) {
        return w(str, list == null ? null : new HashSet(list));
    }

    @Override // F2.AbstractC0277c.b
    public Boolean g(String str, String str2) {
        if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") || str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy") || str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
            throw new RuntimeException("StorageError: This string cannot be stored as it clashes with special identifier prefixes");
        }
        return Boolean.valueOf(this.f1622c.edit().putString(str, str2).commit());
    }

    @Override // F2.AbstractC0277c.b
    public Boolean j(String str, String str2) {
        return Boolean.valueOf(this.f1622c.edit().putString(str, str2).commit());
    }

    @Override // F2.AbstractC0277c.b
    public Boolean k(String str, List list) {
        SharedPreferences.Editor editorEdit = this.f1622c.edit();
        Map<String, ?> all = this.f1622c.getAll();
        ArrayList arrayList = new ArrayList();
        for (String str2 : all.keySet()) {
            if (str2.startsWith(str) && (list == null || list.contains(str2))) {
                arrayList.add(str2);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            editorEdit.remove((String) it.next());
        }
        return Boolean.valueOf(editorEdit.commit());
    }

    @Override // F2.AbstractC0277c.b
    public Boolean m(String str, List list) {
        return Boolean.valueOf(this.f1622c.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + this.f1623d.a(list)).commit());
    }

    @Override // F2.AbstractC0277c.b
    public Boolean o(String str, Boolean bool) {
        return Boolean.valueOf(this.f1622c.edit().putBoolean(str, bool.booleanValue()).commit());
    }

    @Override // F2.AbstractC0277c.b
    public Boolean q(String str, Double d4) {
        String string = Double.toString(d4.doubleValue());
        return Boolean.valueOf(this.f1622c.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + string).commit());
    }

    @Override // s2.InterfaceC1536a
    public void r(InterfaceC1536a.b bVar) {
        AbstractC0277c.b.p(bVar.b(), null);
    }

    @Override // F2.AbstractC0277c.b
    public Boolean remove(String str) {
        return Boolean.valueOf(this.f1622c.edit().remove(str).commit());
    }

    public final Map w(String str, Set set) {
        Map<String, ?> all = this.f1622c.getAll();
        HashMap map = new HashMap();
        for (String str2 : all.keySet()) {
            if (str2.startsWith(str) && (set == null || set.contains(str2))) {
                Object obj = all.get(str2);
                Objects.requireNonNull(obj);
                map.put(str2, y(str2, obj));
            }
        }
        return map;
    }

    public final Object y(String str, Object obj) {
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu")) {
                return str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!") ? obj : this.f1623d.b(str2.substring(40));
            }
            if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy")) {
                return new BigInteger(str2.substring(44), 36);
            }
            if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
                return Double.valueOf(str2.substring(40));
            }
        } else if (obj instanceof Set) {
            ArrayList arrayList = new ArrayList((Set) obj);
            this.f1622c.edit().remove(str).putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + this.f1623d.a(arrayList)).apply();
            return arrayList;
        }
        return obj;
    }

    public C0275a(G g4) {
        this.f1623d = g4;
    }
}
