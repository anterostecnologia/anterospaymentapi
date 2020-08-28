package br.com.anteros.payment.api.braspag.domain.subordinate;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Attachment {
	
	@JsonProperty("AttachmentType")
	private AttachementType attachmentType; // ProofOfBankDomicile (Comprovante de domicílio bancário) e ModelOfAdhesionTerm (Modelo de termo de adesão)
	
	@JsonProperty("file")
	private File file;

	public AttachementType getAttachmentType() {
		return attachmentType;
	}

	public void setAttachmentType(AttachementType attachmentType) {
		this.attachmentType = attachmentType;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

}
