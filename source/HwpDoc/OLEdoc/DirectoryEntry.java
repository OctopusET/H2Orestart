/* Copyright (C) 2023 ebandal
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>
 */
/* 본 제품은 한글과컴퓨터의 ᄒᆞᆫ글 문서 파일(.hwp) 공개 문서를 참고하여 개발하였습니다.
 * 개방형 워드프로세서 마크업 언어(OWPML) 문서 구조 KS X 6101:2018 문서를 참고하였습니다.
 * 작성자 : 반희수 ebandal@gmail.com  
 * 작성일 : 2022.10
 */
package HwpDoc.OLEdoc;

import java.util.List;

public class DirectoryEntry {
	String directoryEntryName;
	int objectType;
	int colorFlag;
	int leftSiblingID;
	int rightSiblingID;
	int childID;
	long clsID1;
	long clsID2;
	int stateBit;
	long creationTime;
	long modifiedTime;
	int startingSectorID;
	long streamSize;
	List<Integer> secNums;
	
	public DirectoryEntry(String directoryEntryName, int objectType, int colorFlag, int leftSiblingID, int rightSiblingID, int childID, 
							long clsID1, long clsID2, int stateBit, long creationTime, long modifiedTime, int startingSectorID, long streamSize) { 
		this.directoryEntryName = directoryEntryName;
		this.objectType = objectType;
		this.colorFlag = colorFlag;
		this.leftSiblingID = leftSiblingID;
		this.rightSiblingID = rightSiblingID;
		this.childID = childID;
		this.clsID1 = clsID1;
		this.clsID2 = clsID2;
		this.stateBit = stateBit;
		this.creationTime = creationTime;
		this.modifiedTime = modifiedTime;
		this.startingSectorID = startingSectorID;
		this.streamSize = streamSize;
	}

	public int getObjectType() {
		return objectType;
	}

	public String getDirectoryEntryName() {
		return directoryEntryName;
	}
}
