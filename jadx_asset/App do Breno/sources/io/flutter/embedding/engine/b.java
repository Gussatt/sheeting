package io.flutter.embedding.engine;

import android.content.Context;
import io.flutter.embedding.engine.a;
import io.flutter.plugin.platform.C1090w;
import java.util.ArrayList;
import java.util.List;
import l2.C1387a;
import o2.C1472a;
import q2.d;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f7777a = new ArrayList();

    public class a implements a.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ io.flutter.embedding.engine.a f7778a;

        public a(io.flutter.embedding.engine.a aVar) {
            this.f7778a = aVar;
        }

        @Override // io.flutter.embedding.engine.a.b
        public void a() {
            b.this.f7777a.remove(this.f7778a);
        }

        @Override // io.flutter.embedding.engine.a.b
        public void b() {
        }
    }

    /* JADX INFO: renamed from: io.flutter.embedding.engine.b$b, reason: collision with other inner class name */
    public static class C0128b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Context f7780a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public C1472a.b f7781b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f7782c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public List f7783d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public C1090w f7784e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f7785f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f7786g = false;

        public C0128b(Context context) {
            this.f7780a = context;
        }

        public boolean a() {
            return this.f7785f;
        }

        public Context b() {
            return this.f7780a;
        }

        public C1472a.b c() {
            return this.f7781b;
        }

        public List d() {
            return this.f7783d;
        }

        public String e() {
            return this.f7782c;
        }

        public C1090w f() {
            return this.f7784e;
        }

        public boolean g() {
            return this.f7786g;
        }

        public C0128b h(boolean z3) {
            this.f7785f = z3;
            return this;
        }

        public C0128b i(C1472a.b bVar) {
            this.f7781b = bVar;
            return this;
        }

        public C0128b j(List list) {
            this.f7783d = list;
            return this;
        }

        public C0128b k(String str) {
            this.f7782c = str;
            return this;
        }

        public C0128b l(boolean z3) {
            this.f7786g = z3;
            return this;
        }
    }

    public b(Context context, String[] strArr) {
        d dVarC = C1387a.e().c();
        if (dVarC.m()) {
            return;
        }
        dVarC.o(context.getApplicationContext());
        dVarC.f(context.getApplicationContext(), strArr);
    }

    public io.flutter.embedding.engine.a a(C0128b c0128b) {
        io.flutter.embedding.engine.a aVarF;
        Context contextB = c0128b.b();
        C1472a.b bVarC = c0128b.c();
        String strE = c0128b.e();
        List listD = c0128b.d();
        C1090w c1090wF = c0128b.f();
        if (c1090wF == null) {
            c1090wF = new C1090w();
        }
        C1090w c1090w = c1090wF;
        boolean zA = c0128b.a();
        boolean zG = c0128b.g();
        if (bVarC == null) {
            bVarC = C1472a.b.a();
        }
        C1472a.b bVar = bVarC;
        if (this.f7777a.size() == 0) {
            aVarF = b(contextB, c1090w, zA, zG);
            if (strE != null) {
                aVarF.p().c(strE);
            }
            aVarF.l().i(bVar, listD);
        } else {
            aVarF = ((io.flutter.embedding.engine.a) this.f7777a.get(0)).F(contextB, bVar, strE, listD, c1090w, zA, zG);
        }
        this.f7777a.add(aVarF);
        aVarF.f(new a(aVarF));
        return aVarF;
    }

    public io.flutter.embedding.engine.a b(Context context, C1090w c1090w, boolean z3, boolean z4) {
        return new io.flutter.embedding.engine.a(context, null, null, c1090w, null, z3, z4, this);
    }
}
