/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
 */
package com.luna.tencent.response.group;

import com.luna.tencent.dto.face.FaceInfosDTO;

/**
 * @author luna
 * 2021/6/14
 */
public class ResultsReturnsByGroupResponse {

    /**
     * 检测出的人脸框位置。
     */
    private FaceInfosDTO             FaceRect;

    /**
     * 识别结果。
     */
    private GroupCandidateResponse[] GroupCandidates;

    /**
     * 检测出的人脸图片状态返回码。0 表示正常。
     * -1601代表不符合图片质量控制要求，此时Candidate内容为空。
     */
    private Long                     RetCode;

    /**
     * Get 检测出的人脸框位置。
     * 
     * @return FaceRect 检测出的人脸框位置。
     */
    public FaceInfosDTO getFaceRect() {
        return this.FaceRect;
    }

    /**
     * Set 检测出的人脸框位置。
     * 
     * @param FaceRect 检测出的人脸框位置。
     */
    public void setFaceRect(FaceInfosDTO FaceRect) {
        this.FaceRect = FaceRect;
    }

    /**
     * Get 识别结果。
     * 
     * @return GroupCandidates 识别结果。
     */
    public GroupCandidateResponse[] getGroupCandidates() {
        return this.GroupCandidates;
    }

    /**
     * Set 识别结果。
     * 
     * @param GroupCandidates 识别结果。
     */
    public void setGroupCandidates(GroupCandidateResponse[] GroupCandidates) {
        this.GroupCandidates = GroupCandidates;
    }

    /**
     * Get 检测出的人脸图片状态返回码。0 表示正常。
     * -1601代表不符合图片质量控制要求，此时Candidate内容为空。
     * 
     * @return RetCode 检测出的人脸图片状态返回码。0 表示正常。
     * -1601代表不符合图片质量控制要求，此时Candidate内容为空。
     */
    public Long getRetCode() {
        return this.RetCode;
    }

    /**
     * Set 检测出的人脸图片状态返回码。0 表示正常。
     * -1601代表不符合图片质量控制要求，此时Candidate内容为空。
     * 
     * @param RetCode 检测出的人脸图片状态返回码。0 表示正常。
     * -1601代表不符合图片质量控制要求，此时Candidate内容为空。
     */
    public void setRetCode(Long RetCode) {
        this.RetCode = RetCode;
    }

}
