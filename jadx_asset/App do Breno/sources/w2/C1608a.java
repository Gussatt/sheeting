package w2;

import java.nio.ByteBuffer;
import l2.AbstractC1388b;
import w2.InterfaceC1609b;

/* JADX INFO: renamed from: w2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1608a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1609b f11855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC1615h f11857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC1609b.c f11858d;

    /* JADX INFO: renamed from: w2.a$b */
    public final class b implements InterfaceC1609b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f11859a;

        /* JADX INFO: renamed from: w2.a$b$a, reason: collision with other inner class name */
        public class C0183a implements e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC1609b.InterfaceC0184b f11861a;

            public C0183a(InterfaceC1609b.InterfaceC0184b interfaceC0184b) {
                this.f11861a = interfaceC0184b;
            }

            @Override // w2.C1608a.e
            public void a(Object obj) {
                this.f11861a.a(C1608a.this.f11857c.a(obj));
            }
        }

        @Override // w2.InterfaceC1609b.a
        public void a(ByteBuffer byteBuffer, InterfaceC1609b.InterfaceC0184b interfaceC0184b) {
            try {
                this.f11859a.a(C1608a.this.f11857c.b(byteBuffer), new C0183a(interfaceC0184b));
            } catch (RuntimeException e4) {
                AbstractC1388b.c("BasicMessageChannel#" + C1608a.this.f11856b, "Failed to handle message", e4);
                interfaceC0184b.a(null);
            }
        }

        public b(d dVar) {
            this.f11859a = dVar;
        }
    }

    /* JADX INFO: renamed from: w2.a$c */
    public final class c implements InterfaceC1609b.InterfaceC0184b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f11863a;

        @Override // w2.InterfaceC1609b.InterfaceC0184b
        public void a(ByteBuffer byteBuffer) {
            try {
                this.f11863a.a(C1608a.this.f11857c.b(byteBuffer));
            } catch (RuntimeException e4) {
                AbstractC1388b.c("BasicMessageChannel#" + C1608a.this.f11856b, "Failed to handle message reply", e4);
            }
        }

        public c(e eVar) {
            this.f11863a = eVar;
        }
    }

    /* JADX INFO: renamed from: w2.a$d */
    public interface d {
        void a(Object obj, e eVar);
    }

    /* JADX INFO: renamed from: w2.a$e */
    public interface e {
        void a(Object obj);
    }

    public C1608a(InterfaceC1609b interfaceC1609b, String str, InterfaceC1615h interfaceC1615h) {
        this(interfaceC1609b, str, interfaceC1615h, null);
    }

    public void c(Object obj) {
        d(obj, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void d(Object obj, e eVar) {
        this.f11855a.c(this.f11856b, this.f11857c.a(obj), eVar != null ? new c(eVar) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [w2.b] */
    /* JADX WARN: Type inference failed for: r1v0, types: [w2.a$a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [w2.b$a] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void e(d dVar) {
        if (this.f11858d != null) {
            this.f11855a.d(this.f11856b, dVar != null ? new b(dVar) : null, this.f11858d);
        } else {
            this.f11855a.h(this.f11856b, dVar != null ? new b(dVar) : 0);
        }
    }

    public C1608a(InterfaceC1609b interfaceC1609b, String str, InterfaceC1615h interfaceC1615h, InterfaceC1609b.c cVar) {
        this.f11855a = interfaceC1609b;
        this.f11856b = str;
        this.f11857c = interfaceC1615h;
        this.f11858d = cVar;
    }
}
