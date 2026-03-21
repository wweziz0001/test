package g4;

import a0.C0200z;
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

/* JADX INFO: loaded from: classes.dex */
public final class j extends i {
    public static Long g(FileTime fileTime) {
        long millis = fileTime.toMillis();
        Long lValueOf = Long.valueOf(millis);
        if (millis != 0) {
            return lValueOf;
        }
        return null;
    }

    @Override // g4.i, g4.f
    public final e b(l lVar) {
        N3.h.e(lVar, "path");
        Path pathF = lVar.f();
        try {
            BasicFileAttributes attributes = Files.readAttributes(pathF, (Class<BasicFileAttributes>) BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            Path symbolicLink = attributes.isSymbolicLink() ? Files.readSymbolicLink(pathF) : null;
            boolean zIsRegularFile = attributes.isRegularFile();
            boolean zIsDirectory = attributes.isDirectory();
            if (symbolicLink != null) {
                String str = l.f5856m;
                C0200z.s(symbolicLink.toString(), false);
            }
            Long lValueOf = Long.valueOf(attributes.size());
            FileTime fileTimeCreationTime = attributes.creationTime();
            Long lG = fileTimeCreationTime != null ? g(fileTimeCreationTime) : null;
            FileTime fileTimeLastModifiedTime = attributes.lastModifiedTime();
            Long lG2 = fileTimeLastModifiedTime != null ? g(fileTimeLastModifiedTime) : null;
            FileTime fileTimeLastAccessTime = attributes.lastAccessTime();
            return new e(zIsRegularFile, zIsDirectory, lValueOf, lG, lG2, fileTimeLastAccessTime != null ? g(fileTimeLastAccessTime) : null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    @Override // g4.i
    public final void c(l lVar, l lVar2) throws IOException {
        N3.h.e(lVar2, "target");
        try {
            Files.move(lVar.f(), lVar2.f(), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e5) {
            throw new FileNotFoundException(e5.getMessage());
        }
    }

    @Override // g4.i
    public final String toString() {
        return "NioSystemFileSystem";
    }
}
