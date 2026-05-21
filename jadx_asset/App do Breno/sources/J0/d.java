package J0;

import K0.InterfaceC0456d;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.zip.Adler32;

/* JADX INFO: loaded from: classes.dex */
public class d implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f2286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0456d f2287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f2288c;

    public d(Context context, InterfaceC0456d interfaceC0456d, f fVar) {
        this.f2286a = context;
        this.f2287b = interfaceC0456d;
        this.f2288c = fVar;
    }

    @Override // J0.x
    public void a(C0.p pVar, int i4) {
        b(pVar, i4, false);
    }

    @Override // J0.x
    public void b(C0.p pVar, int i4, boolean z3) {
        ComponentName componentName = new ComponentName(this.f2286a, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f2286a.getSystemService("jobscheduler");
        int iC = c(pVar);
        if (!z3 && d(jobScheduler, iC, i4)) {
            G0.a.b("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", pVar);
            return;
        }
        long jL = this.f2287b.L(pVar);
        JobInfo.Builder builderC = this.f2288c.c(new JobInfo.Builder(iC, componentName), pVar.d(), jL, i4);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i4);
        persistableBundle.putString("backendName", pVar.b());
        persistableBundle.putInt("priority", N0.a.a(pVar.d()));
        if (pVar.c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(pVar.c(), 0));
        }
        builderC.setExtras(persistableBundle);
        G0.a.c("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", pVar, Integer.valueOf(iC), Long.valueOf(this.f2288c.g(pVar.d(), jL, i4)), Long.valueOf(jL), Integer.valueOf(i4));
        jobScheduler.schedule(builderC.build());
    }

    public int c(C0.p pVar) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f2286a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(pVar.b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(N0.a.a(pVar.d())).array());
        if (pVar.c() != null) {
            adler32.update(pVar.c());
        }
        return (int) adler32.getValue();
    }

    public final boolean d(JobScheduler jobScheduler, int i4, int i5) {
        Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            JobInfo next = it.next();
            int i6 = next.getExtras().getInt("attemptNumber");
            if (next.getId() == i4) {
                if (i6 >= i5) {
                    return true;
                }
            }
        }
        return false;
    }
}
