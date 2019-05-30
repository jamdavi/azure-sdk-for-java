// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.models;

import com.azure.core.annotations.HeaderCollection;
import com.azure.core.implementation.DateTimeRfc1123;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Map;

/**
 * Defines headers for Download operation.
 */
@JacksonXmlRootElement(localName = "File-Download-Headers")
public final class FileDownloadHeaders {
    /*
     * Returns the date and time the file was last modified. Any operation that
     * modifies the file or its properties updates the last modified time.
     */
    @JsonProperty(value = "Last-Modified")
    private DateTimeRfc1123 lastModified;

    /*
     * The metadata property.
     */
    @HeaderCollection("x-ms-meta-")
    private Map<String, String> metadata;

    /*
     * The number of bytes present in the response body.
     */
    @JsonProperty(value = "Content-Length")
    private Long contentLength;

    /*
     * The content type specified for the file. The default content type is
     * 'application/octet-stream'
     */
    @JsonProperty(value = "Content-Type")
    private String contentType;

    /*
     * Indicates the range of bytes returned if the client requested a subset
     * of the file by setting the Range request header.
     */
    @JsonProperty(value = "Content-Range")
    private String contentRange;

    /*
     * The ETag contains a value that you can use to perform operations
     * conditionally, in quotes.
     */
    @JsonProperty(value = "ETag")
    private String eTag;

    /*
     * If the file has an MD5 hash and the request is to read the full file,
     * this response header is returned so that the client can check for
     * message content integrity. If the request is to read a specified range
     * and the 'x-ms-range-get-content-md5' is set to true, then the request
     * returns an MD5 hash for the range, as long as the range size is less
     * than or equal to 4 MB. If neither of these sets of conditions is true,
     * then no value is returned for the 'Content-MD5' header.
     */
    @JsonProperty(value = "Content-MD5")
    private byte[] contentMD5;

    /*
     * Returns the value that was specified for the Content-Encoding request
     * header.
     */
    @JsonProperty(value = "Content-Encoding")
    private String contentEncoding;

    /*
     * Returned if it was previously specified for the file.
     */
    @JsonProperty(value = "Cache-Control")
    private String cacheControl;

    /*
     * Returns the value that was specified for the 'x-ms-content-disposition'
     * header and specifies how to process the response.
     */
    @JsonProperty(value = "Content-Disposition")
    private String contentDisposition;

    /*
     * Returns the value that was specified for the Content-Language request
     * header.
     */
    @JsonProperty(value = "Content-Language")
    private String contentLanguage;

    /*
     * This header uniquely identifies the request that was made and can be
     * used for troubleshooting the request.
     */
    @JsonProperty(value = "x-ms-request-id")
    private String requestId;

    /*
     * Indicates the version of the File service used to execute the request.
     */
    @JsonProperty(value = "x-ms-version")
    private String version;

    /*
     * Indicates that the service supports requests for partial file content.
     */
    @JsonProperty(value = "Accept-Ranges")
    private String acceptRanges;

    /*
     * A UTC date/time value generated by the service that indicates the time
     * at which the response was initiated.
     */
    @JsonProperty(value = "Date")
    private DateTimeRfc1123 dateProperty;

    /*
     * Conclusion time of the last attempted Copy File operation where this
     * file was the destination file. This value can specify the time of a
     * completed, aborted, or failed copy attempt.
     */
    @JsonProperty(value = "x-ms-copy-completion-time")
    private DateTimeRfc1123 copyCompletionTime;

    /*
     * Only appears when x-ms-copy-status is failed or pending. Describes cause
     * of fatal or non-fatal copy operation failure.
     */
    @JsonProperty(value = "x-ms-copy-status-description")
    private String copyStatusDescription;

    /*
     * String identifier for the last attempted Copy File operation where this
     * file was the destination file.
     */
    @JsonProperty(value = "x-ms-copy-id")
    private String copyId;

    /*
     * Contains the number of bytes copied and the total bytes in the source in
     * the last attempted Copy File operation where this file was the
     * destination file. Can show between 0 and Content-Length bytes copied.
     */
    @JsonProperty(value = "x-ms-copy-progress")
    private String copyProgress;

    /*
     * URL up to 2KB in length that specifies the source file used in the last
     * attempted Copy File operation where this file was the destination file.
     */
    @JsonProperty(value = "x-ms-copy-source")
    private String copySource;

    /*
     * State of the copy operation identified by 'x-ms-copy-id'. Possible
     * values include: 'pending', 'success', 'aborted', 'failed'
     */
    @JsonProperty(value = "x-ms-copy-status")
    private CopyStatusType copyStatus;

    /*
     * If the file has a MD5 hash, and if request contains range header (Range
     * or x-ms-range), this response header is returned with the value of the
     * whole file's MD5 value. This value may or may not be equal to the value
     * returned in Content-MD5 header, with the latter calculated from the
     * requested range.
     */
    @JsonProperty(value = "x-ms-content-md5")
    private byte[] fileContentMD5;

    /*
     * The value of this header is set to true if the file data and application
     * metadata are completely encrypted using the specified algorithm.
     * Otherwise, the value is set to false (when the file is unencrypted, or
     * if only parts of the file/application metadata are encrypted).
     */
    @JsonProperty(value = "x-ms-server-encrypted")
    private Boolean isServerEncrypted;

    /*
     * The errorCode property.
     */
    @JsonProperty(value = "x-ms-error-code")
    private String errorCode;

    /**
     * Get the lastModified property: Returns the date and time the file was
     * last modified. Any operation that modifies the file or its properties
     * updates the last modified time.
     *
     * @return the lastModified value.
     */
    public OffsetDateTime lastModified() {
        if (this.lastModified == null) {
            return null;
        }
        return this.lastModified.dateTime();
    }

    /**
     * Set the lastModified property: Returns the date and time the file was
     * last modified. Any operation that modifies the file or its properties
     * updates the last modified time.
     *
     * @param lastModified the lastModified value to set.
     * @return the FileDownloadHeaders object itself.
     */
    public FileDownloadHeaders lastModified(OffsetDateTime lastModified) {
        if (lastModified == null) {
            this.lastModified = null;
        } else {
            this.lastModified = new DateTimeRfc1123(lastModified);
        }
        return this;
    }

    /**
     * Get the metadata property: The metadata property.
     *
     * @return the metadata value.
     */
    public Map<String, String> metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: The metadata property.
     *
     * @param metadata the metadata value to set.
     * @return the FileDownloadHeaders object itself.
     */
    public FileDownloadHeaders metadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the contentLength property: The number of bytes present in the
     * response body.
     *
     * @return the contentLength value.
     */
    public Long contentLength() {
        return this.contentLength;
    }

    /**
     * Set the contentLength property: The number of bytes present in the
     * response body.
     *
     * @param contentLength the contentLength value to set.
     * @return the FileDownloadHeaders object itself.
     */
    public FileDownloadHeaders contentLength(Long contentLength) {
        this.contentLength = contentLength;
        return this;
    }

    /**
     * Get the contentType property: The content type specified for the file.
     * The default content type is 'application/octet-stream'.
     *
     * @return the contentType value.
     */
    public String contentType() {
        return this.contentType;
    }

    /**
     * Set the contentType property: The content type specified for the file.
     * The default content type is 'application/octet-stream'.
     *
     * @param contentType the contentType value to set.
     * @return the FileDownloadHeaders object itself.
     */
    public FileDownloadHeaders contentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Get the contentRange property: Indicates the range of bytes returned if
     * the client requested a subset of the file by setting the Range request
     * header.
     *
     * @return the contentRange value.
     */
    public String contentRange() {
        return this.contentRange;
    }

    /**
     * Set the contentRange property: Indicates the range of bytes returned if
     * the client requested a subset of the file by setting the Range request
     * header.
     *
     * @param contentRange the contentRange value to set.
     * @return the FileDownloadHeaders object itself.
     */
    public FileDownloadHeaders contentRange(String contentRange) {
        this.contentRange = contentRange;
        return this;
    }

    /**
     * Get the eTag property: The ETag contains a value that you can use to
     * perform operations conditionally, in quotes.
     *
     * @return the eTag value.
     */
    public String eTag() {
        return this.eTag;
    }

    /**
     * Set the eTag property: The ETag contains a value that you can use to
     * perform operations conditionally, in quotes.
     *
     * @param eTag the eTag value to set.
     * @return the FileDownloadHeaders object itself.
     */
    public FileDownloadHeaders eTag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Get the contentMD5 property: If the file has an MD5 hash and the request
     * is to read the full file, this response header is returned so that the
     * client can check for message content integrity. If the request is to
     * read a specified range and the 'x-ms-range-get-content-md5' is set to
     * true, then the request returns an MD5 hash for the range, as long as the
     * range size is less than or equal to 4 MB. If neither of these sets of
     * conditions is true, then no value is returned for the 'Content-MD5'
     * header.
     *
     * @return the contentMD5 value.
     */
    public byte[] contentMD5() {
        return Arrays.copyOf(this.contentMD5, this.contentMD5.length);
    }

    /**
     * Set the contentMD5 property: If the file has an MD5 hash and the request
     * is to read the full file, this response header is returned so that the
     * client can check for message content integrity. If the request is to
     * read a specified range and the 'x-ms-range-get-content-md5' is set to
     * true, then the request returns an MD5 hash for the range, as long as the
     * range size is less than or equal to 4 MB. If neither of these sets of
     * conditions is true, then no value is returned for the 'Content-MD5'
     * header.
     *
     * @param contentMD5 the contentMD5 value to set.
     * @return the FileDownloadHeaders object itself.
     */
    public FileDownloadHeaders contentMD5(byte[] contentMD5) {
        this.contentMD5 = Arrays.copyOf(contentMD5, contentMD5.length);
        return this;
    }

    /**
     * Get the contentEncoding property: Returns the value that was specified
     * for the Content-Encoding request header.
     *
     * @return the contentEncoding value.
     */
    public String contentEncoding() {
        return this.contentEncoding;
    }

    /**
     * Set the contentEncoding property: Returns the value that was specified
     * for the Content-Encoding request header.
     *
     * @param contentEncoding the contentEncoding value to set.
     * @return the FileDownloadHeaders object itself.
     */
    public FileDownloadHeaders contentEncoding(String contentEncoding) {
        this.contentEncoding = contentEncoding;
        return this;
    }

    /**
     * Get the cacheControl property: Returned if it was previously specified
     * for the file.
     *
     * @return the cacheControl value.
     */
    public String cacheControl() {
        return this.cacheControl;
    }

    /**
     * Set the cacheControl property: Returned if it was previously specified
     * for the file.
     *
     * @param cacheControl the cacheControl value to set.
     * @return the FileDownloadHeaders object itself.
     */
    public FileDownloadHeaders cacheControl(String cacheControl) {
        this.cacheControl = cacheControl;
        return this;
    }

    /**
     * Get the contentDisposition property: Returns the value that was
     * specified for the 'x-ms-content-disposition' header and specifies how to
     * process the response.
     *
     * @return the contentDisposition value.
     */
    public String contentDisposition() {
        return this.contentDisposition;
    }

    /**
     * Set the contentDisposition property: Returns the value that was
     * specified for the 'x-ms-content-disposition' header and specifies how to
     * process the response.
     *
     * @param contentDisposition the contentDisposition value to set.
     * @return the FileDownloadHeaders object itself.
     */
    public FileDownloadHeaders contentDisposition(String contentDisposition) {
        this.contentDisposition = contentDisposition;
        return this;
    }

    /**
     * Get the contentLanguage property: Returns the value that was specified
     * for the Content-Language request header.
     *
     * @return the contentLanguage value.
     */
    public String contentLanguage() {
        return this.contentLanguage;
    }

    /**
     * Set the contentLanguage property: Returns the value that was specified
     * for the Content-Language request header.
     *
     * @param contentLanguage the contentLanguage value to set.
     * @return the FileDownloadHeaders object itself.
     */
    public FileDownloadHeaders contentLanguage(String contentLanguage) {
        this.contentLanguage = contentLanguage;
        return this;
    }

    /**
     * Get the requestId property: This header uniquely identifies the request
     * that was made and can be used for troubleshooting the request.
     *
     * @return the requestId value.
     */
    public String requestId() {
        return this.requestId;
    }

    /**
     * Set the requestId property: This header uniquely identifies the request
     * that was made and can be used for troubleshooting the request.
     *
     * @param requestId the requestId value to set.
     * @return the FileDownloadHeaders object itself.
     */
    public FileDownloadHeaders requestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Get the version property: Indicates the version of the File service used
     * to execute the request.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version property: Indicates the version of the File service used
     * to execute the request.
     *
     * @param version the version value to set.
     * @return the FileDownloadHeaders object itself.
     */
    public FileDownloadHeaders version(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the acceptRanges property: Indicates that the service supports
     * requests for partial file content.
     *
     * @return the acceptRanges value.
     */
    public String acceptRanges() {
        return this.acceptRanges;
    }

    /**
     * Set the acceptRanges property: Indicates that the service supports
     * requests for partial file content.
     *
     * @param acceptRanges the acceptRanges value to set.
     * @return the FileDownloadHeaders object itself.
     */
    public FileDownloadHeaders acceptRanges(String acceptRanges) {
        this.acceptRanges = acceptRanges;
        return this;
    }

    /**
     * Get the dateProperty property: A UTC date/time value generated by the
     * service that indicates the time at which the response was initiated.
     *
     * @return the dateProperty value.
     */
    public OffsetDateTime dateProperty() {
        if (this.dateProperty == null) {
            return null;
        }
        return this.dateProperty.dateTime();
    }

    /**
     * Set the dateProperty property: A UTC date/time value generated by the
     * service that indicates the time at which the response was initiated.
     *
     * @param dateProperty the dateProperty value to set.
     * @return the FileDownloadHeaders object itself.
     */
    public FileDownloadHeaders dateProperty(OffsetDateTime dateProperty) {
        if (dateProperty == null) {
            this.dateProperty = null;
        } else {
            this.dateProperty = new DateTimeRfc1123(dateProperty);
        }
        return this;
    }

    /**
     * Get the copyCompletionTime property: Conclusion time of the last
     * attempted Copy File operation where this file was the destination file.
     * This value can specify the time of a completed, aborted, or failed copy
     * attempt.
     *
     * @return the copyCompletionTime value.
     */
    public OffsetDateTime copyCompletionTime() {
        if (this.copyCompletionTime == null) {
            return null;
        }
        return this.copyCompletionTime.dateTime();
    }

    /**
     * Set the copyCompletionTime property: Conclusion time of the last
     * attempted Copy File operation where this file was the destination file.
     * This value can specify the time of a completed, aborted, or failed copy
     * attempt.
     *
     * @param copyCompletionTime the copyCompletionTime value to set.
     * @return the FileDownloadHeaders object itself.
     */
    public FileDownloadHeaders copyCompletionTime(OffsetDateTime copyCompletionTime) {
        if (copyCompletionTime == null) {
            this.copyCompletionTime = null;
        } else {
            this.copyCompletionTime = new DateTimeRfc1123(copyCompletionTime);
        }
        return this;
    }

    /**
     * Get the copyStatusDescription property: Only appears when
     * x-ms-copy-status is failed or pending. Describes cause of fatal or
     * non-fatal copy operation failure.
     *
     * @return the copyStatusDescription value.
     */
    public String copyStatusDescription() {
        return this.copyStatusDescription;
    }

    /**
     * Set the copyStatusDescription property: Only appears when
     * x-ms-copy-status is failed or pending. Describes cause of fatal or
     * non-fatal copy operation failure.
     *
     * @param copyStatusDescription the copyStatusDescription value to set.
     * @return the FileDownloadHeaders object itself.
     */
    public FileDownloadHeaders copyStatusDescription(String copyStatusDescription) {
        this.copyStatusDescription = copyStatusDescription;
        return this;
    }

    /**
     * Get the copyId property: String identifier for the last attempted Copy
     * File operation where this file was the destination file.
     *
     * @return the copyId value.
     */
    public String copyId() {
        return this.copyId;
    }

    /**
     * Set the copyId property: String identifier for the last attempted Copy
     * File operation where this file was the destination file.
     *
     * @param copyId the copyId value to set.
     * @return the FileDownloadHeaders object itself.
     */
    public FileDownloadHeaders copyId(String copyId) {
        this.copyId = copyId;
        return this;
    }

    /**
     * Get the copyProgress property: Contains the number of bytes copied and
     * the total bytes in the source in the last attempted Copy File operation
     * where this file was the destination file. Can show between 0 and
     * Content-Length bytes copied.
     *
     * @return the copyProgress value.
     */
    public String copyProgress() {
        return this.copyProgress;
    }

    /**
     * Set the copyProgress property: Contains the number of bytes copied and
     * the total bytes in the source in the last attempted Copy File operation
     * where this file was the destination file. Can show between 0 and
     * Content-Length bytes copied.
     *
     * @param copyProgress the copyProgress value to set.
     * @return the FileDownloadHeaders object itself.
     */
    public FileDownloadHeaders copyProgress(String copyProgress) {
        this.copyProgress = copyProgress;
        return this;
    }

    /**
     * Get the copySource property: URL up to 2KB in length that specifies the
     * source file used in the last attempted Copy File operation where this
     * file was the destination file.
     *
     * @return the copySource value.
     */
    public String copySource() {
        return this.copySource;
    }

    /**
     * Set the copySource property: URL up to 2KB in length that specifies the
     * source file used in the last attempted Copy File operation where this
     * file was the destination file.
     *
     * @param copySource the copySource value to set.
     * @return the FileDownloadHeaders object itself.
     */
    public FileDownloadHeaders copySource(String copySource) {
        this.copySource = copySource;
        return this;
    }

    /**
     * Get the copyStatus property: State of the copy operation identified by
     * 'x-ms-copy-id'. Possible values include: 'pending', 'success',
     * 'aborted', 'failed'.
     *
     * @return the copyStatus value.
     */
    public CopyStatusType copyStatus() {
        return this.copyStatus;
    }

    /**
     * Set the copyStatus property: State of the copy operation identified by
     * 'x-ms-copy-id'. Possible values include: 'pending', 'success',
     * 'aborted', 'failed'.
     *
     * @param copyStatus the copyStatus value to set.
     * @return the FileDownloadHeaders object itself.
     */
    public FileDownloadHeaders copyStatus(CopyStatusType copyStatus) {
        this.copyStatus = copyStatus;
        return this;
    }

    /**
     * Get the fileContentMD5 property: If the file has a MD5 hash, and if
     * request contains range header (Range or x-ms-range), this response
     * header is returned with the value of the whole file's MD5 value. This
     * value may or may not be equal to the value returned in Content-MD5
     * header, with the latter calculated from the requested range.
     *
     * @return the fileContentMD5 value.
     */
    public byte[] fileContentMD5() {
        return Arrays.copyOf(this.fileContentMD5, this.fileContentMD5.length);
    }

    /**
     * Set the fileContentMD5 property: If the file has a MD5 hash, and if
     * request contains range header (Range or x-ms-range), this response
     * header is returned with the value of the whole file's MD5 value. This
     * value may or may not be equal to the value returned in Content-MD5
     * header, with the latter calculated from the requested range.
     *
     * @param fileContentMD5 the fileContentMD5 value to set.
     * @return the FileDownloadHeaders object itself.
     */
    public FileDownloadHeaders fileContentMD5(byte[] fileContentMD5) {
        this.fileContentMD5 = Arrays.copyOf(fileContentMD5, fileContentMD5.length);
        return this;
    }

    /**
     * Get the isServerEncrypted property: The value of this header is set to
     * true if the file data and application metadata are completely encrypted
     * using the specified algorithm. Otherwise, the value is set to false
     * (when the file is unencrypted, or if only parts of the file/application
     * metadata are encrypted).
     *
     * @return the isServerEncrypted value.
     */
    public Boolean isServerEncrypted() {
        return this.isServerEncrypted;
    }

    /**
     * Set the isServerEncrypted property: The value of this header is set to
     * true if the file data and application metadata are completely encrypted
     * using the specified algorithm. Otherwise, the value is set to false
     * (when the file is unencrypted, or if only parts of the file/application
     * metadata are encrypted).
     *
     * @param isServerEncrypted the isServerEncrypted value to set.
     * @return the FileDownloadHeaders object itself.
     */
    public FileDownloadHeaders isServerEncrypted(Boolean isServerEncrypted) {
        this.isServerEncrypted = isServerEncrypted;
        return this;
    }

    /**
     * Get the errorCode property: The errorCode property.
     *
     * @return the errorCode value.
     */
    public String errorCode() {
        return this.errorCode;
    }

    /**
     * Set the errorCode property: The errorCode property.
     *
     * @param errorCode the errorCode value to set.
     * @return the FileDownloadHeaders object itself.
     */
    public FileDownloadHeaders errorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
}
