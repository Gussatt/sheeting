package w1;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f11815a = new i() { // from class: w1.h
        @Override // w1.i
        public final List a(ComponentRegistrar componentRegistrar) {
            return componentRegistrar.getComponents();
        }
    };

    List a(ComponentRegistrar componentRegistrar);
}
