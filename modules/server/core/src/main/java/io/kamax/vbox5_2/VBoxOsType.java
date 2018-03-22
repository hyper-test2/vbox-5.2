/*
 * Hyperbox - Virtual Infrastructure Manager
 * Copyright (C) 2018 Kamax Sarl
 * 
 * http://kamax.io/hbox/
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
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package io.kamax.vbox5_2;

import io.kamax.hboxd.hypervisor._RawOsType;
import org.virtualbox_5_2.IGuestOSType;

public class VBoxOsType implements _RawOsType {

    private String id;
    private String name;
    private String familyName;
    private long bitness;

    public VBoxOsType(IGuestOSType vboxGuestOs) {
        id = vboxGuestOs.getId();
        name = vboxGuestOs.getDescription();
        familyName = vboxGuestOs.getFamilyDescription();
        bitness = vboxGuestOs.getIs64Bit() ? 64L : 32L;
    }

    /**
     * @return the id
     */
    @Override
    public String getId() {
        return id;
    }

    /**
     * @return the name
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * @return the familyName
     */
    public String getFamilyName() {
        return familyName;
    }

    /**
     * @return the bitness
     */
    @Override
    public long getBitness() {
        return bitness;
    }

}
