package io.flutter.view;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.accessibility.AccessibilityRecord;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import l2.AbstractC1388b;

/* JADX INFO: loaded from: classes.dex */
class AccessibilityViewEmbedder {
    private static final String TAG = "AccessibilityBridge";
    private int nextFlutterId;
    private final View rootAccessibilityView;
    private final b reflectionAccessors = new b();
    private final SparseArray<c> flutterIdToOrigin = new SparseArray<>();
    private final Map<c, Integer> originToFlutterId = new HashMap();
    private final Map<View, Rect> embeddedViewToDisplayBounds = new HashMap();

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f8084a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Method f8085b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Method f8086c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Method f8087d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Field f8088e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Method f8089f;

        public static int j(long j4) {
            return (int) (j4 >> 32);
        }

        public static boolean k(long j4, int i4) {
            return (j4 & (1 << i4)) != 0;
        }

        public static Long l(AccessibilityNodeInfo accessibilityNodeInfo) {
            if (Build.VERSION.SDK_INT < 26) {
                AbstractC1388b.g(AccessibilityViewEmbedder.TAG, "Unexpected Android version. Unable to find the parent ID.");
                return null;
            }
            AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.setDataPosition(0);
            accessibilityNodeInfoObtain.writeToParcel(parcelObtain, 0);
            parcelObtain.setDataPosition(0);
            long j4 = parcelObtain.readLong();
            if (k(j4, 0)) {
                parcelObtain.readInt();
            }
            if (k(j4, 1)) {
                parcelObtain.readLong();
            }
            if (k(j4, 2)) {
                parcelObtain.readInt();
            }
            Long lValueOf = k(j4, 3) ? Long.valueOf(parcelObtain.readLong()) : null;
            parcelObtain.recycle();
            return lValueOf;
        }

        public final Long f(AccessibilityNodeInfo accessibilityNodeInfo, int i4) {
            Method method = this.f8087d;
            if (method == null && (this.f8088e == null || this.f8089f == null)) {
                return null;
            }
            if (method != null) {
                try {
                    return (Long) method.invoke(accessibilityNodeInfo, Integer.valueOf(i4));
                } catch (IllegalAccessException e4) {
                    AbstractC1388b.h(AccessibilityViewEmbedder.TAG, "Failed to access getChildId method.", e4);
                } catch (InvocationTargetException e5) {
                    AbstractC1388b.h(AccessibilityViewEmbedder.TAG, "The getChildId method threw an exception when invoked.", e5);
                }
            } else {
                try {
                    Long l4 = (Long) this.f8089f.invoke(this.f8088e.get(accessibilityNodeInfo), Integer.valueOf(i4));
                    l4.longValue();
                    return l4;
                } catch (ArrayIndexOutOfBoundsException e6) {
                    e = e6;
                    AbstractC1388b.h(AccessibilityViewEmbedder.TAG, "The longArrayGetIndex method threw an exception when invoked.", e);
                    return null;
                } catch (IllegalAccessException e7) {
                    AbstractC1388b.h(AccessibilityViewEmbedder.TAG, "Failed to access longArrayGetIndex method or the childNodeId field.", e7);
                } catch (InvocationTargetException e8) {
                    e = e8;
                    AbstractC1388b.h(AccessibilityViewEmbedder.TAG, "The longArrayGetIndex method threw an exception when invoked.", e);
                    return null;
                }
            }
            return null;
        }

        public final Long g(AccessibilityNodeInfo accessibilityNodeInfo) {
            Method method = this.f8085b;
            if (method != null) {
                try {
                    Long l4 = (Long) method.invoke(accessibilityNodeInfo, new Object[0]);
                    l4.longValue();
                    return l4;
                } catch (IllegalAccessException e4) {
                    AbstractC1388b.h(AccessibilityViewEmbedder.TAG, "Failed to access getParentNodeId method.", e4);
                } catch (InvocationTargetException e5) {
                    AbstractC1388b.h(AccessibilityViewEmbedder.TAG, "The getParentNodeId method threw an exception when invoked.", e5);
                }
            }
            return l(accessibilityNodeInfo);
        }

        public final Long h(AccessibilityRecord accessibilityRecord) {
            Method method = this.f8086c;
            if (method == null) {
                return null;
            }
            try {
                return (Long) method.invoke(accessibilityRecord, new Object[0]);
            } catch (IllegalAccessException e4) {
                AbstractC1388b.h(AccessibilityViewEmbedder.TAG, "Failed to access the getRecordSourceNodeId method.", e4);
                return null;
            } catch (InvocationTargetException e5) {
                AbstractC1388b.h(AccessibilityViewEmbedder.TAG, "The getRecordSourceNodeId method threw an exception when invoked.", e5);
                return null;
            }
        }

        public final Long i(AccessibilityNodeInfo accessibilityNodeInfo) {
            Method method = this.f8084a;
            if (method == null) {
                return null;
            }
            try {
                return (Long) method.invoke(accessibilityNodeInfo, new Object[0]);
            } catch (IllegalAccessException e4) {
                AbstractC1388b.h(AccessibilityViewEmbedder.TAG, "Failed to access getSourceNodeId method.", e4);
                return null;
            } catch (InvocationTargetException e5) {
                AbstractC1388b.h(AccessibilityViewEmbedder.TAG, "The getSourceNodeId method threw an exception when invoked.", e5);
                return null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b() throws NoSuchMethodException {
            Method method;
            Method method2;
            Method method3;
            Method method4;
            Field field;
            Method method5;
            Method method6 = null;
            try {
                method = AccessibilityNodeInfo.class.getMethod("getSourceNodeId", new Class[0]);
            } catch (NoSuchMethodException unused) {
                AbstractC1388b.g(AccessibilityViewEmbedder.TAG, "can't invoke AccessibilityNodeInfo#getSourceNodeId with reflection");
                method = null;
            }
            try {
                method2 = AccessibilityRecord.class.getMethod("getSourceNodeId", new Class[0]);
            } catch (NoSuchMethodException unused2) {
                AbstractC1388b.g(AccessibilityViewEmbedder.TAG, "can't invoke AccessibiiltyRecord#getSourceNodeId with reflection");
                method2 = null;
            }
            int i4 = Build.VERSION.SDK_INT;
            Class cls = Integer.TYPE;
            if (i4 > 26) {
                try {
                    Field declaredField = AccessibilityNodeInfo.class.getDeclaredField("mChildNodeIds");
                    declaredField.setAccessible(true);
                    method5 = Class.forName("android.util.LongArray").getMethod("get", cls);
                    field = declaredField;
                    method4 = null;
                } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException | NullPointerException unused3) {
                    AbstractC1388b.g(AccessibilityViewEmbedder.TAG, "can't access childNodeIdsField with reflection");
                    method4 = null;
                    field = null;
                    method5 = field;
                }
                this.f8084a = method;
                this.f8085b = method6;
                this.f8086c = method2;
                this.f8087d = method4;
                this.f8088e = field;
                this.f8089f = method5;
            }
            try {
                method3 = AccessibilityNodeInfo.class.getMethod("getParentNodeId", new Class[0]);
            } catch (NoSuchMethodException unused4) {
                AbstractC1388b.g(AccessibilityViewEmbedder.TAG, "can't invoke getParentNodeId with reflection");
                method3 = null;
            }
            try {
                method4 = AccessibilityNodeInfo.class.getMethod("getChildId", cls);
                field = null;
            } catch (NoSuchMethodException unused5) {
                AbstractC1388b.g(AccessibilityViewEmbedder.TAG, "can't invoke getChildId with reflection");
                method4 = null;
                field = null;
            }
            method6 = method3;
            method5 = field;
            this.f8084a = method;
            this.f8085b = method6;
            this.f8086c = method2;
            this.f8087d = method4;
            this.f8088e = field;
            this.f8089f = method5;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f8090a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f8091b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f8091b == cVar.f8091b && this.f8090a.equals(cVar.f8090a);
        }

        public int hashCode() {
            return ((this.f8090a.hashCode() + 31) * 31) + this.f8091b;
        }

        public c(View view, int i4) {
            this.f8090a = view;
            this.f8091b = i4;
        }
    }

    public AccessibilityViewEmbedder(View view, int i4) {
        this.rootAccessibilityView = view;
        this.nextFlutterId = i4;
    }

    private void addChildrenToFlutterNode(AccessibilityNodeInfo accessibilityNodeInfo, View view, AccessibilityNodeInfo accessibilityNodeInfo2) {
        int iIntValue;
        for (int i4 = 0; i4 < accessibilityNodeInfo.getChildCount(); i4++) {
            Long lF = this.reflectionAccessors.f(accessibilityNodeInfo, i4);
            if (lF != null) {
                int iJ = b.j(lF.longValue());
                c cVar = new c(view, iJ);
                if (this.originToFlutterId.containsKey(cVar)) {
                    iIntValue = this.originToFlutterId.get(cVar).intValue();
                } else {
                    int i5 = this.nextFlutterId;
                    this.nextFlutterId = i5 + 1;
                    cacheVirtualIdMappings(view, iJ, i5);
                    iIntValue = i5;
                }
                accessibilityNodeInfo2.addChild(this.rootAccessibilityView, iIntValue);
            }
        }
    }

    private void cacheVirtualIdMappings(View view, int i4, int i5) {
        c cVar = new c(view, i4);
        this.originToFlutterId.put(cVar, Integer.valueOf(i5));
        this.flutterIdToOrigin.put(i5, cVar);
    }

    private AccessibilityNodeInfo convertToFlutterNode(AccessibilityNodeInfo accessibilityNodeInfo, int i4, View view) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(this.rootAccessibilityView, i4);
        accessibilityNodeInfoObtain.setPackageName(this.rootAccessibilityView.getContext().getPackageName());
        accessibilityNodeInfoObtain.setSource(this.rootAccessibilityView, i4);
        accessibilityNodeInfoObtain.setClassName(accessibilityNodeInfo.getClassName());
        Rect rect = this.embeddedViewToDisplayBounds.get(view);
        copyAccessibilityFields(accessibilityNodeInfo, accessibilityNodeInfoObtain);
        setFlutterNodesTranslateBounds(accessibilityNodeInfo, rect, accessibilityNodeInfoObtain);
        addChildrenToFlutterNode(accessibilityNodeInfo, view, accessibilityNodeInfoObtain);
        setFlutterNodeParent(accessibilityNodeInfo, view, accessibilityNodeInfoObtain);
        return accessibilityNodeInfoObtain;
    }

    private void copyAccessibilityFields(AccessibilityNodeInfo accessibilityNodeInfo, AccessibilityNodeInfo accessibilityNodeInfo2) {
        accessibilityNodeInfo2.setAccessibilityFocused(accessibilityNodeInfo.isAccessibilityFocused());
        accessibilityNodeInfo2.setCheckable(accessibilityNodeInfo.isCheckable());
        accessibilityNodeInfo2.setChecked(accessibilityNodeInfo.isChecked());
        accessibilityNodeInfo2.setContentDescription(accessibilityNodeInfo.getContentDescription());
        accessibilityNodeInfo2.setEnabled(accessibilityNodeInfo.isEnabled());
        accessibilityNodeInfo2.setClickable(accessibilityNodeInfo.isClickable());
        accessibilityNodeInfo2.setFocusable(accessibilityNodeInfo.isFocusable());
        accessibilityNodeInfo2.setFocused(accessibilityNodeInfo.isFocused());
        accessibilityNodeInfo2.setLongClickable(accessibilityNodeInfo.isLongClickable());
        accessibilityNodeInfo2.setMovementGranularities(accessibilityNodeInfo.getMovementGranularities());
        accessibilityNodeInfo2.setPassword(accessibilityNodeInfo.isPassword());
        accessibilityNodeInfo2.setScrollable(accessibilityNodeInfo.isScrollable());
        accessibilityNodeInfo2.setSelected(accessibilityNodeInfo.isSelected());
        accessibilityNodeInfo2.setText(accessibilityNodeInfo.getText());
        accessibilityNodeInfo2.setVisibleToUser(accessibilityNodeInfo.isVisibleToUser());
        accessibilityNodeInfo2.setEditable(accessibilityNodeInfo.isEditable());
        accessibilityNodeInfo2.setCanOpenPopup(accessibilityNodeInfo.canOpenPopup());
        accessibilityNodeInfo2.setCollectionInfo(accessibilityNodeInfo.getCollectionInfo());
        accessibilityNodeInfo2.setCollectionItemInfo(accessibilityNodeInfo.getCollectionItemInfo());
        accessibilityNodeInfo2.setContentInvalid(accessibilityNodeInfo.isContentInvalid());
        accessibilityNodeInfo2.setDismissable(accessibilityNodeInfo.isDismissable());
        accessibilityNodeInfo2.setInputType(accessibilityNodeInfo.getInputType());
        accessibilityNodeInfo2.setLiveRegion(accessibilityNodeInfo.getLiveRegion());
        accessibilityNodeInfo2.setMultiLine(accessibilityNodeInfo.isMultiLine());
        accessibilityNodeInfo2.setRangeInfo(accessibilityNodeInfo.getRangeInfo());
        accessibilityNodeInfo2.setError(accessibilityNodeInfo.getError());
        accessibilityNodeInfo2.setMaxTextLength(accessibilityNodeInfo.getMaxTextLength());
        int i4 = Build.VERSION.SDK_INT;
        accessibilityNodeInfo2.setContextClickable(accessibilityNodeInfo.isContextClickable());
        accessibilityNodeInfo2.setDrawingOrder(accessibilityNodeInfo.getDrawingOrder());
        accessibilityNodeInfo2.setImportantForAccessibility(accessibilityNodeInfo.isImportantForAccessibility());
        if (i4 >= 26) {
            accessibilityNodeInfo2.setAvailableExtraData(accessibilityNodeInfo.getAvailableExtraData());
            accessibilityNodeInfo2.setHintText(accessibilityNodeInfo.getHintText());
            accessibilityNodeInfo2.setShowingHintText(accessibilityNodeInfo.isShowingHintText());
        }
    }

    private void setFlutterNodeParent(AccessibilityNodeInfo accessibilityNodeInfo, View view, AccessibilityNodeInfo accessibilityNodeInfo2) {
        Long lG = this.reflectionAccessors.g(accessibilityNodeInfo);
        if (lG == null) {
            return;
        }
        Integer num = this.originToFlutterId.get(new c(view, b.j(lG.longValue())));
        if (num != null) {
            accessibilityNodeInfo2.setParent(this.rootAccessibilityView, num.intValue());
        }
    }

    private void setFlutterNodesTranslateBounds(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect, AccessibilityNodeInfo accessibilityNodeInfo2) {
        Rect rect2 = new Rect();
        accessibilityNodeInfo.getBoundsInParent(rect2);
        accessibilityNodeInfo2.setBoundsInParent(rect2);
        Rect rect3 = new Rect();
        accessibilityNodeInfo.getBoundsInScreen(rect3);
        rect3.offset(rect.left, rect.top);
        accessibilityNodeInfo2.setBoundsInScreen(rect3);
    }

    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i4) {
        AccessibilityNodeInfo accessibilityNodeInfoCreateAccessibilityNodeInfo;
        c cVar = this.flutterIdToOrigin.get(i4);
        if (cVar == null || !this.embeddedViewToDisplayBounds.containsKey(cVar.f8090a) || cVar.f8090a.getAccessibilityNodeProvider() == null || (accessibilityNodeInfoCreateAccessibilityNodeInfo = cVar.f8090a.getAccessibilityNodeProvider().createAccessibilityNodeInfo(cVar.f8091b)) == null) {
            return null;
        }
        return convertToFlutterNode(accessibilityNodeInfoCreateAccessibilityNodeInfo, i4, cVar.f8090a);
    }

    public Integer getRecordFlutterId(View view, AccessibilityRecord accessibilityRecord) {
        Long lH = this.reflectionAccessors.h(accessibilityRecord);
        if (lH == null) {
            return null;
        }
        return this.originToFlutterId.get(new c(view, b.j(lH.longValue())));
    }

    public AccessibilityNodeInfo getRootNode(View view, int i4, Rect rect) {
        AccessibilityNodeInfo accessibilityNodeInfoCreateAccessibilityNodeInfo = view.createAccessibilityNodeInfo();
        Long lI = this.reflectionAccessors.i(accessibilityNodeInfoCreateAccessibilityNodeInfo);
        if (lI == null) {
            return null;
        }
        this.embeddedViewToDisplayBounds.put(view, rect);
        cacheVirtualIdMappings(view, b.j(lI.longValue()), i4);
        return convertToFlutterNode(accessibilityNodeInfoCreateAccessibilityNodeInfo, i4, view);
    }

    public boolean onAccessibilityHoverEvent(int i4, MotionEvent motionEvent) {
        c cVar = this.flutterIdToOrigin.get(i4);
        if (cVar == null) {
            return false;
        }
        Rect rect = this.embeddedViewToDisplayBounds.get(cVar.f8090a);
        int pointerCount = motionEvent.getPointerCount();
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i5 = 0; i5 < motionEvent.getPointerCount(); i5++) {
            MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
            pointerPropertiesArr[i5] = pointerProperties;
            motionEvent.getPointerProperties(i5, pointerProperties);
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            motionEvent.getPointerCoords(i5, pointerCoords);
            MotionEvent.PointerCoords pointerCoords2 = new MotionEvent.PointerCoords(pointerCoords);
            pointerCoordsArr[i5] = pointerCoords2;
            pointerCoords2.x -= rect.left;
            pointerCoords2.y -= rect.top;
        }
        return cVar.f8090a.dispatchGenericMotionEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), motionEvent.getPointerCount(), pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags()));
    }

    public boolean performAction(int i4, int i5, Bundle bundle) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        c cVar = this.flutterIdToOrigin.get(i4);
        if (cVar == null || (accessibilityNodeProvider = cVar.f8090a.getAccessibilityNodeProvider()) == null) {
            return false;
        }
        return accessibilityNodeProvider.performAction(cVar.f8091b, i5, bundle);
    }

    public View platformViewOfNode(int i4) {
        c cVar = this.flutterIdToOrigin.get(i4);
        if (cVar == null) {
            return null;
        }
        return cVar.f8090a;
    }

    public boolean requestSendAccessibilityEvent(View view, View view2, AccessibilityEvent accessibilityEvent) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(accessibilityEvent);
        Long lH = this.reflectionAccessors.h(accessibilityEvent);
        if (lH == null) {
            return false;
        }
        int iJ = b.j(lH.longValue());
        Integer num = this.originToFlutterId.get(new c(view, iJ));
        if (num == null) {
            int i4 = this.nextFlutterId;
            this.nextFlutterId = i4 + 1;
            Integer numValueOf = Integer.valueOf(i4);
            cacheVirtualIdMappings(view, iJ, i4);
            num = numValueOf;
        }
        accessibilityEventObtain.setSource(this.rootAccessibilityView, num.intValue());
        accessibilityEventObtain.setClassName(accessibilityEvent.getClassName());
        accessibilityEventObtain.setPackageName(accessibilityEvent.getPackageName());
        for (int i5 = 0; i5 < accessibilityEventObtain.getRecordCount(); i5++) {
            AccessibilityRecord record = accessibilityEventObtain.getRecord(i5);
            Long lH2 = this.reflectionAccessors.h(record);
            if (lH2 == null) {
                return false;
            }
            c cVar = new c(view, b.j(lH2.longValue()));
            if (!this.originToFlutterId.containsKey(cVar)) {
                return false;
            }
            record.setSource(this.rootAccessibilityView, this.originToFlutterId.get(cVar).intValue());
        }
        return this.rootAccessibilityView.getParent().requestSendAccessibilityEvent(view2, accessibilityEventObtain);
    }
}
