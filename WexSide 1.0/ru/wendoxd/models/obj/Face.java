package ru.wendoxd.models.obj;

import net.minecraft.util.math.Vec3d;

public class Face {
	public Vertex[] vertices;
	public Vertex[] vertexNormals;
	public Vertex faceNormal;
	public TextureCoordinate[] textureCoordinates;

	public void addFaceForRender(CustomTessellator tessellator) {
		addFaceForRender(tessellator, 0.0005F);
	}

	public void addFaceForRender(CustomTessellator tessellator, float textureOffset) {
		if (faceNormal == null) {
			faceNormal = this.calculateFaceNormal();
		}

		tessellator.setNormal(faceNormal.x, faceNormal.y, faceNormal.z);
		float averageU = 0F;
		float averageV = 0F;

		if ((textureCoordinates != null) && (textureCoordinates.length > 0)) {
			for (TextureCoordinate textureCoordinate : textureCoordinates) {
				averageU += textureCoordinate.u;
				averageV += textureCoordinate.v;
			}

			averageU = averageU / textureCoordinates.length;
			averageV = averageV / textureCoordinates.length;
		}

		float offsetU, offsetV;

		for (int i = 0; i < vertices.length; ++i) {

			if ((textureCoordinates != null) && (textureCoordinates.length > 0)) {
				offsetU = textureOffset;
				offsetV = textureOffset;

				if (textureCoordinates[i].u > averageU) {
					offsetU = -offsetU;
				}
				if (textureCoordinates[i].v > averageV) {
					offsetV = -offsetV;
				}

				tessellator.addVertexWithUV(vertices[i].x, vertices[i].y, vertices[i].z,
						textureCoordinates[i].u + offsetU, textureCoordinates[i].v + offsetV);
			} else {
				tessellator.addVertex(vertices[i].x, vertices[i].y, vertices[i].z);
			}
		}
	}

	public Vertex calculateFaceNormal() {
		Vec3d v1 = new Vec3d(vertices[1].x - vertices[0].x, vertices[1].y - vertices[0].y,
				vertices[1].z - vertices[0].z);
		Vec3d v2 = new Vec3d(vertices[2].x - vertices[0].x, vertices[2].y - vertices[0].y,
				vertices[2].z - vertices[0].z);
		Vec3d normalVector = null;

		normalVector = v1.crossProduct(v2).normalize();

		return new Vertex((float) normalVector.xCoord, (float) normalVector.yCoord, (float) normalVector.zCoord);
	}
}