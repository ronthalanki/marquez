/*
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

package marquez.service.models;

import java.util.Optional;
import javax.annotation.Nullable;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;
import marquez.common.models.Description;
import marquez.common.models.NamespaceName;
import marquez.common.models.OwnerName;

@Value
@Builder
public class NamespaceMeta {
  @NonNull NamespaceName name;
  @NonNull OwnerName ownerName;
  @Nullable Description description;

  public Optional<Description> getDescription() {
    return Optional.ofNullable(description);
  }
}
