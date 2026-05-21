package t3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import t3.J;

/* JADX INFO: loaded from: classes.dex */
public class E extends C1557m {
    @Override // t3.C1557m, t3.AbstractC1552h
    public void a(J j4, J j5) throws IOException {
        X2.l.e(j4, "source");
        X2.l.e(j5, "target");
        try {
            Files.move(j4.r(), j5.r(), AbstractC1561q.a(StandardCopyOption.ATOMIC_MOVE), AbstractC1561q.a(StandardCopyOption.REPLACE_EXISTING));
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e4) {
            throw new FileNotFoundException(e4.getMessage());
        }
    }

    @Override // t3.C1557m, t3.AbstractC1552h
    public C1551g h(J j4) {
        X2.l.e(j4, "path");
        return o(j4.r());
    }

    public final C1551g o(Path path) {
        X2.l.e(path, "nioPath");
        try {
            BasicFileAttributes attributes = Files.readAttributes(path, (Class<BasicFileAttributes>) AbstractC1558n.a(), LinkOption.NOFOLLOW_LINKS);
            Path symbolicLink = attributes.isSymbolicLink() ? Files.readSymbolicLink(path) : null;
            boolean zIsRegularFile = attributes.isRegularFile();
            boolean zIsDirectory = attributes.isDirectory();
            J jF = symbolicLink != null ? J.a.f(J.f11359n, symbolicLink, false, 1, null) : null;
            Long lValueOf = Long.valueOf(attributes.size());
            FileTime fileTimeCreationTime = attributes.creationTime();
            Long lP = fileTimeCreationTime != null ? p(fileTimeCreationTime) : null;
            FileTime fileTimeLastModifiedTime = attributes.lastModifiedTime();
            Long lP2 = fileTimeLastModifiedTime != null ? p(fileTimeLastModifiedTime) : null;
            FileTime fileTimeLastAccessTime = attributes.lastAccessTime();
            return new C1551g(zIsRegularFile, zIsDirectory, jF, lValueOf, lP, lP2, fileTimeLastAccessTime != null ? p(fileTimeLastAccessTime) : null, null, 128, null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    public final Long p(FileTime fileTime) {
        Long lValueOf = Long.valueOf(fileTime.toMillis());
        if (lValueOf.longValue() != 0) {
            return lValueOf;
        }
        return null;
    }

    @Override // t3.C1557m
    public String toString() {
        return "NioSystemFileSystem";
    }
}
