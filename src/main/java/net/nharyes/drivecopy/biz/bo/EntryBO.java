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

package net.nharyes.drivecopy.biz.bo;

import java.io.File;

public class EntryBO implements BusinessObject {

	private String id;
	
	private File file;
	
	private String name;
	
	private String mimeType;
	
	private boolean skipRevision;
	
	private String md5Sum;

	public String getId() {
		
		return id;
	}

	public void setId(String id) {
		
		this.id = id;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMimeType() {

		return mimeType;
	}

	public void setMimeType(String mimeType) {

		this.mimeType = mimeType;
	}

	public boolean isSkipRevision() {

		return skipRevision;
	}

	public void setSkipRevision(boolean skipRevision) {

		this.skipRevision = skipRevision;
	}

	public String getMd5Sum() {

		return md5Sum;
	}

	public void setMd5Sum(String md5Sum) {

		this.md5Sum = md5Sum;
	}
}
