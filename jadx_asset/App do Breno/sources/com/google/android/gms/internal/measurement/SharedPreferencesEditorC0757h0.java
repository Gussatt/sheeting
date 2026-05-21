package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class SharedPreferencesEditorC0757h0 implements SharedPreferences.Editor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f6742a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f6743b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f6744c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SharedPreferencesC0775j0 f6745d;

    public /* synthetic */ SharedPreferencesEditorC0757h0(SharedPreferencesC0775j0 sharedPreferencesC0775j0, AbstractC0766i0 abstractC0766i0) {
        this.f6745d = sharedPreferencesC0775j0;
    }

    public final void a(String str, Object obj) {
        if (obj != null) {
            this.f6744c.put(str, obj);
        } else {
            remove(str);
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        commit();
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        this.f6742a = true;
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        if (this.f6742a) {
            this.f6745d.f6840a.clear();
        }
        SharedPreferencesC0775j0 sharedPreferencesC0775j0 = this.f6745d;
        Set setKeySet = sharedPreferencesC0775j0.f6840a.keySet();
        Set set = this.f6743b;
        setKeySet.removeAll(set);
        Map map = this.f6744c;
        for (Map.Entry entry : map.entrySet()) {
            sharedPreferencesC0775j0.f6840a.put((String) entry.getKey(), entry.getValue());
        }
        for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : sharedPreferencesC0775j0.f6841b) {
            p1.z zVarD = p1.w.c(set, map.keySet()).iterator();
            while (zVarD.hasNext()) {
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(sharedPreferencesC0775j0, (String) zVarD.next());
            }
        }
        return (!this.f6742a && set.isEmpty() && map.isEmpty()) ? false : true;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z3) {
        a(str, Boolean.valueOf(z3));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f4) {
        a(str, Float.valueOf(f4));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i4) {
        a(str, Integer.valueOf(i4));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j4) {
        a(str, Long.valueOf(j4));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        a(str, str2);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        a(str, set);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        this.f6743b.add(str);
        return this;
    }
}
