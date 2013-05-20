/*
 * Copyright 2013 serso aka se.solovyev
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Contact details
 *
 * Email: se.solovyev@gmail.com
 * Site:  http://se.solovyev.org
 */

package org.solovyev.android.keyboard;

import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.EditorInfo;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * User: Solovyev_S
 * Date: 02.11.12
 * Time: 12:17
 */
public interface AKeyboardInput {

	void commitTyped();

	void onText(@Nullable CharSequence text);

	@Nonnull
	EditorInfo getCurrentInputEditorInfo();

	@Nullable
	CharSequence getTypedText();

	boolean handleBackspace();

	void sendKeyEvent(@Nonnull KeyEvent keyEvent);

	int translateKeyDown(int unicodeChar);

	void commitCompletion(@Nonnull CompletionInfo completionInfo);

	void append(char primaryCode);

	void commitText(@Nullable String text, int i);

	void handleCursorRight();

	void handleCursorLeft();

	void handleClear();

	void handlePaste();

	void handleCopy();

	void clearMetaKeyStates(int flags);

	void keyDownUp(int keyEventCode);

	void finishComposingText();

	boolean isInputConnected();

	int getCursorCapsMode(int inputType);

	void clearTypedText();

    /*
	**********************************************************************
    *
    *                           HISTORY
    *
    **********************************************************************
    */

	void undo();

	void redo();
}
