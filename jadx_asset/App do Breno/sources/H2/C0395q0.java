package H2;

import android.webkit.PermissionRequest;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: H2.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0395q0 extends AbstractC0372m1 {
    public C0395q0(O3 o32) {
        super(o32);
    }

    @Override // H2.AbstractC0372m1
    public void b(PermissionRequest permissionRequest) {
        permissionRequest.deny();
    }

    @Override // H2.AbstractC0372m1
    public void d(PermissionRequest permissionRequest, List list) {
        permissionRequest.grant((String[]) list.toArray(new String[0]));
    }

    @Override // H2.AbstractC0372m1
    public List g(PermissionRequest permissionRequest) {
        return Arrays.asList(permissionRequest.getResources());
    }
}
