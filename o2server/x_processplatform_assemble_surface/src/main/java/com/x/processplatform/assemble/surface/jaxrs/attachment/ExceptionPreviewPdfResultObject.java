package com.x.processplatform.assemble.surface.jaxrs.attachment;

import com.x.base.core.project.exception.PromptException;

class ExceptionPreviewPdfResultObject extends PromptException {

	private static final long serialVersionUID = 9085364457175859374L;

	ExceptionPreviewPdfResultObject(String flag) {
		super("对象不存在:{}.", flag);
	}

}
