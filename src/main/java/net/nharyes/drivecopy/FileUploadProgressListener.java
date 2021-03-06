/**
 * Copyright 2012 Luca Zanconato
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.nharyes.drivecopy;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.logging.Logger;

import com.google.api.client.googleapis.media.MediaHttpUploader;
import com.google.api.client.googleapis.media.MediaHttpUploaderProgressListener;
import com.google.inject.Singleton;

@Singleton
public class FileUploadProgressListener implements MediaHttpUploaderProgressListener {

	/*
	 * Logger
	 */
	protected final Logger logger = Logger.getLogger(getClass().getName());

	@Override
	public void progressChanged(MediaHttpUploader uploader) throws IOException {

		switch (uploader.getUploadState()) {
		case INITIATION_STARTED:
			logger.info("Starting upload...");
			break;
		case INITIATION_COMPLETE:
			logger.info("Upload started");
			break;
		case MEDIA_IN_PROGRESS:
			logger.info(String.format("Progress: %s", MessageFormat.format("{0,number,#%}", uploader.getProgress())));
			break;
		case MEDIA_COMPLETE:
			logger.info("Upload complete");
			break;
		case NOT_STARTED:
			break;
		}
	}
}