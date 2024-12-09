package org.connecttag.commons.extensions

import android.content.Context
import org.connecttag.commons.models.FileDirItem

fun FileDirItem.isRecycleBinPath(context: Context): Boolean {
    return path.startsWith(context.recycleBinPath)
}
