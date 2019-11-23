package org.xml.sc;

import java.io.File;

public class SourceCorrespondence {
	
	private final File file;
	private final int startLine;
	private final int startColumn;
	private final int startOffset;
	private final int endLine;
	private final int endColumn;
	private final int endOffset;
	
	public SourceCorrespondence(int startLine, int startColumn, int startOffset, int endLine, int endColumn, int endOffset) {
		this(null, startLine, startColumn, startOffset, endLine, endColumn, endOffset);
	}
	
	public SourceCorrespondence(File file, int startLine, int startColumn, int startOffset, int endLine, int endColumn, int endOffset) {
		this.file = file;
		this.startLine = startLine;
		this.startColumn = startColumn;
		this.startOffset = startOffset;
		this.endLine = endLine;
		this.endColumn = endColumn;
		this.endOffset = endOffset;
	}
	
	public File getFile() {
		return file;
	}

	public int getStartLine() {
		return startLine;
	}

	public int getStartColumn() {
		return startColumn;
	}

	public int getStartOffset() {
		return startOffset;
	}

	public int getEndLine() {
		return endLine;
	}

	public int getEndColumn() {
		return endColumn;
	}

	public int getEndOffset() {
		return endOffset;
	}
	
	public int getLength() {
		return endOffset - startOffset;
	}

	@Override
	public String toString() {
		return "SourceCorrespondence [file=" + file + ", startLine=" + startLine + ", startColumn=" + startColumn
				+ ", startOffset=" + startOffset + ", endLine=" + endLine + ", endColumn=" + endColumn + ", endOffset="
				+ endOffset + "]";
	}

	public static SourceCorrespondence buildFileSourceCorrespondence(File file, SourceCorrespondence sc) {
		return new SourceCorrespondence(file, sc.getStartLine(), sc.getStartColumn(), sc.getStartOffset(), sc.getEndLine(), sc.getEndColumn(), sc.getEndOffset());
	}
	
}
